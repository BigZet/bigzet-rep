library(tidyverse)


right_rect <- function(f, a, b, n){
  h=(b-a)/n
  result=0
  for (i in 1:n) {
    result = result + f(a+h*(i-1))*h
  }
  return(result)
}

middle_rect <- function(f, a, b, n){
  h=(b-a)/n
  result=0
  for (i in 1:n) {
    result = result + f(a+h*(i-1)+h/2)*h
  }
  return(result)
}

trapeze <- function(f, a, b, n){
  h=(b-a)/n
  result=0
  for (i in 1:n) {
    result = result + (f(a+h*(i-1)) + f(a+h*(i)))*h/2
  }
  return(result)
}

simpson <- function(f, a, b, n){
  h=(b-a)/(2*n)
  first=0
  second=0
  for (i in 1:n) {
    first = first + f(a+2*h*i-h)
    second = second + f(a+2*h*i)
  }
  result=h/3*(f(a)+f(b)+4*first+2*second)
  return(result)
}

f <- function(x){
  result = (x^3 - x^2 +5*x + 5*sin(2*x+x^2)*cos(2*x+x^2)+3)*exp(-x)
  return(result)
}

integrating <- function(a, b, n, way){

  switch(way,
         rr = right_rect(f, a, b, n),
         mr = middle_rect(f, a, b, n),
         tr = trapeze(f, a, b, n),
         sm = simpson(f, a, b, n), 
         {
           print("Please, check method type")
           return(NULL)
         })
  
}

start_exp <- function(from_file=NA){
  
  
  
  id=0
  results = data.frame(
    id=numeric(0),
    a=numeric(0),
    b=numeric(0),
    n=numeric(0),
    type=factor(levels=c("rr", "mr", "tr", "sm", "None")),
    res=numeric(0))
  
  if(!is.na(from_file)){
    start_df=read.csv("start_df.csv")
    for(i in 1:nrow(start_df)){
      id=id+1
      res=integrating(start_df[i,]$a, start_df[i,]$b, start_df[i,]$n, start_df[i,]$type)
      print(res)
      if (is.null(res)) output = data.frame(id=id, a=start_df[i,]$a, b=start_df[i,]$b, n=start_df[i,]$n, type="None", res=NA)
      else output = data.frame(id=id, a=start_df[i,]$a, b=start_df[i,]$b, n=start_df[i,]$n, type=start_df[i,]$type, res=res)
      results = rbind(results, output)
      print(results)
    }
  }
  
  repeat{
    id=id+1
    cat("Enter exp data in format: {right border}/{left border}/{number of parts}/{method ='rr', 'mr', 'tr', 'sm'}; when finish print EOF\n", file=stdout())
    text=readline("")
    if (text == "EOF") {
      break
    }
    arguments = stringr::str_split(text, "/")
    a = as.integer(arguments[[1]][1])
    b = as.integer(arguments[[1]][2])
    n = as.integer(arguments[[1]][3])
    type = arguments[[1]][4]
    #print(type)
    res=integrating(a, b, n, type)
    print(res)
    if (is.null(res)) output = data.frame(id=id, a=a, b=b, n=n, type="None", res=NA)
    else output = data.frame(id=id, a=a, b=b, n=n, type=type, res=res)
    results = rbind(results, output)
    print(results)
  }
  
  write.csv(results, file="end_res.csv")
}

# k1=right_rect(f, 2, 3, 10)
# k2=middle_rect(f, 2, 3, 10)
# k3=trapeze(f, 2, 3, 10)
# k4=simpson(f, 2, 3, 10)
start_df=data.frame(a=2:8, b=3:9, n=rep(1000, times=7), type=c("rr", "tr", "mr", "sm", "mr", "sm", "nn"))
write.csv(start_df, file = "start_df.csv")
print(start_df)
start_exp(from_file = "start_df.csv")
