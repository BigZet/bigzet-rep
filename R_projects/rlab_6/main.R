if ("quantmod" %in% rownames(installed.packages()) == FALSE) {
  install.packages("quantmod") }
library(quantmod)
if ("stringr" %in% rownames(installed.packages()) == FALSE) {
  install.packages("stringr") }
library(stringr)
downloadable_stocks <- c("ATVI", "^IXIC")
quantmod::getSymbols(Symbols = downloadable_stocks, src = "yahoo", from = as.Date.character("1900-01-01"))
df = data.frame(get(downloadable_stocks[1]))
downloadable_stocks <- stringr::str_remove(downloadable_stocks, "[:punct:\\^]")
rm(list = downloadable_stocks)

out_of_trend = function(x, dt, method="Arifm"){
  stopifnot(length(x)>3, dt <= ceiling(length(x)/2)-1, is.numeric(x), is.numeric(dt))
  min_v = min(x)
  #print(x)
  for (i in 1:length(x)) {
    x[i] = x[i]+min_v+1    
  }
  #print(x)
  switch(method, 
         Arifm = arifm(x, dt),
         Geom = geom(x, dt), 
         Garm = garm(x, dt),
         #arifm(x, dt),
         )
}

arifm = function(x, dt){
  res= numeric(0)
  for (i in (dt):(length(x)-dt)){
    res[i-dt]=log((x[i-dt]+x[i+dt])/(2*x[i]))
  }
  return(res)
}

geom = function(x, dt){
  res= numeric(0)
  for (i in (dt):(length(x)-dt)){
    res[i-dt]=log((x[i-dt]*x[i+dt])/(x[i]^2))
  }
  return(res)
}

garm = function(x, dt){
  res= numeric(0)
  for (i in (dt):(length(x)-dt)){
    res[i-dt]=log((2*x[i-dt]*x[i+dt])/(x[i]*(x[i-dt]+x[i+dt])))
  }
  return(res)
}

Alter_Johns = function(y){
  a=numeric(0)
  n=length(x)
  for(t in seq(1, n-1, 1)){
    a[t] = 1/(n-t)*sum(abs(y[-(1:t)]-y[-((n-t+1):n)]))
  }
  return(a)
}

t=seq(0, 10, 0.1)
x=2*t+3+sin(2*t)
m=mean(x)
xn=out_of_trend(x, 2, "Arifm")
mn=mean(xn)
k1 = Alter_Johns(out_of_trend(df$ATVI.Open, 300))
k2 = Alter_Johns(xn)
k3=out_of_trend(df$ATVI.Open, 300)
plot(seq(1, length(k1), 1), k1)
