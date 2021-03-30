library(purrr)
library(dplyr)
library(tidyr)
library(stringr)
names <- c("Jane", "Michael", "Mary", "George")
ages <- c(8, 6, 28, 45)
gender <- c(0, 1, 0, 1)
info = list(names, ages, gender)

print(info[[1]][2])
print(info[[3]])
names(info) = c("name", "age", "gender")
info$drinks = c("juice", "tea", "rum", "coffee")
p = list(name="John", age=2, gender=1, drinks="milk")
result = Map(c, info, p)
index <- "0,72;0,38;0,99;0,81;0,15;0,22;0,16;0,4;0,24"
index = gsub(",", ".", index)
index = strsplit(index, ";")
I = as.numeric(as_vector(index))


#Covid DF
CovidSt = read.csv("https://raw.githubusercontent.com/CSSEGISandData/COVID-19/master/csse_covid_19_data/csse_covid_19_time_series/time_series_covid19_confirmed_global.csv")
glimpse(CovidSt)
CovidSt = unite(CovidSt, "Country/Reg", names(CovidSt)[1], names(CovidSt)[2], sep = "/")

dfStat = CovidSt %>%
  group_by(`Country/Reg`, Lat, Long) %>%
  rowwise() %>%
  transmute(sumx = sum(c_across(everything())), meanx = mean(c_across(everything())), sdx = sd(c_across(everything())))
View(dfStat)

sbstCovid = CovidSt[-1:-3]
rNames = CovidSt[1]
tCovid = transpose(sbstCovid)
colnames(tCovid)=unlist(rNames)
dates = colnames(sbstCovid)

kk = dates %>%
  map(gsub, pattern="X", replacement="" )%>%
  map(strsplit, split="[.]" )

for (x in 1:length(kk)) {
  tCovid$Dates[x] = as.character(ISOdate(as.integer(kk[[x]][[1]][3])+2000, as.integer(kk[[x]][[1]][1]), as.integer(kk[[x]][[1]][2])))
}
tCovid$Dates=as.Date(tCovid$Dates, origin = "1970-01-01")
tCovid = tCovid %>% select(Dates, everything())
mdir= paste0(getwd(), "/data_output")
if(!dir.exists(mdir)) dir.create(mdir)
write.csv(tCovid, file =paste0(mdir, "/result.csv"))
write.table(tCovid, file =paste0(mdir, "/result.txt"))
library("xlsx")
write.xlsx(tCovid, file =paste0(mdir, "/result.xlsx"))