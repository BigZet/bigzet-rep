library(readxl)
library(httr)
library(dplyr)
#url1 = "https://github.com/qwerty29544/RpracticeBook/blob/master/2Data/01FlatTables/GAZ.xlsx?raw=true"
#GET(url1, write_disk(tf <- tempfile(fileext = ".xlsx")))
GAZ = read_xlsx("GAZ.xlsx", col_types = c("list", "numeric", "numeric", "numeric", "numeric", "numeric", "numeric", "text", "text"))
colnames(GAZ) = c("Date", "Rtr MPa", "Tyst in C", "Gaz m^3/syt", "kond-t m3/syt", "water m3/syt", "ID", "Kyst", "Group")


for (i in 1:nrow(GAZ)){
  if(is.character(GAZ$Date[[i]])){
    print
    GAZ$Date[[i]]= as.Date(GAZ$Date[[i]], format="%d/%m/%Y")
  } 
  else{
    GAZ$Date[[i]] = as.Date(GAZ$Date[[i]])
  }
}

GAZ = na.omit(GAZ)
GAZ = GAZ %>% mutate(`Tyst in K` = `Tyst in C`+273,
                     Kyst=as.character(Kyst),
                     ID=as.character(ID),
                     Group=as.character(Group))
GAZ$`Tyst in C`=NULL

GAZ = GAZ %>% mutate(g_k = `Gaz m^3/syt`/`kond-t m3/syt`,
                     g_w = `Gaz m^3/syt`/`water m3/syt`,
                     w_k=`water m3/syt`/`kond-t m3/syt`)

GAZ$Date = as.Date(unlist(GAZ$Date), origin = "1970-01-01")

ssample_1 = GAZ %>%
  filter(format(Date, "%Y") == "2018" & ID == "111") #Подвыборка по ДАТЕ и ID

ssample_2 = GAZ %>%
  group_by(Date) %>%
  summarise(gaz_sum = sum(`Gaz m^3/syt`), ID = ID) %>%
  filter(gaz_sum < 1000) %>%
  select(ID) %>%
  distinct(ID) # Нет значений меньше 1000

ssample_3 = GAZ %>%
  group_by(Date) %>%
  summarise(k_n = n(), gaz_sum =sum(`Gaz m^3/syt`)) %>%
  filter(k_n == 3) %>%
  arrange(Date) #По трем кустам суммарная добыча

ssample_4 = GAZ %>%
  filter(format(Date, "%Y") == "2018") %>%
  group_by(Group) %>%
  summarise(ksum = sum(`Gaz m^3/syt`)) %>%
  filter(ksum == max(ksum)) #Производительная группа 2018

ssample_5 = GAZ %>%
  filter(format(Date, "%Y") == "2018") %>%
  group_by(Kyst) %>%
  summarise(ksum = sum(`water m3/syt`)) %>%
  filter(ksum == max(ksum)) #Производительный куст 2018

ssample_6 = GAZ %>% group_by(Kyst) %>%
  filter(!is.na(g_w) & is.finite(g_w) & g_w !=0) %>%
  summarise(meank = mean(g_w, na.rm = TRUE)) %>%
  filter(meank == max(meank))

View(GAZ) 

