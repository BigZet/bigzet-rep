#First part
#1st task
x = 2
y = 4
t = x
x = y
print(x)
y = t
print(y)

#2nd task
x <-3.5
y <-"2,6"
z <-1.78
h <-TRUE
print(c(class(x), class(y), class(z), class(h)))
class(h) <- "numeric"
class(x) <- "character"

#3rd task
dohod <- 1573
dohod <- log(dohod)
print(dohod)

#4th task
n = as.numeric(readLines(con = "nvar"))
print(2*n-1)

#Second part
#1st task
v = c(1, 0, 2, 3, 6, 8, 12, 15, 0, NA, NA, 9, 4, 16, 2, 0)
print(v[1])
print(v[length(v)])
print(v[3:5])
print(v[v==2])
print(v[v>4 & !is.na(v)])
print(v[v%%3==0 & !is.na(v)])
print(v[v%%3==0 & v>4 & !is.na(v)])
print(which(v==0))
print(which(v>2 & v<=8))
print(sort(v[v!=2], na.last=TRUE))

#2nd task
v[length(v)]=NA

#3rd task
print(which(is.na(v)))

#4th task
print(length(v[is.na(v)]))

#5th task
id=1:100

#6th task
countries = rep(c("France", "Italy", "Spain"), each=5)
year = rep(c(2019, 2020, 2020, 2018, 2017), time = 3)
data.frame(countries, year)

#7th task
income = c(10000, 32000, 28000, 15000, 65000, 1573)
m_income=sum(income)/length(income)
income_class=as.numeric(income>=m_income)
print(income_class)

#8th task
x = as.numeric(readLines(con = "coords.txt", n=4))
p = 4.49
write((sum(abs(x)^p))^(1/p), file="result.txt")

#9th task
dx=x[-1]-x[-length(x)]
d2x=dx[-1]-dx[-length(dx)]
cat(dx, "\n", d2x, file="diff_vectors.txt", sep=" ")