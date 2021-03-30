library(rgl)

f1 = function(x) x^2
t = seq.Date(as.Date("1900-01-01"), Sys.Date(), length.out =  2*as.numeric(Sys.Date()))
plot(t, f1(as.numeric(t)-as.numeric(t[1])), type = 'p',
     main = "График №1",
     xlab="time",
     ylab="function",
     col="red")

success = function(names = c("Bill", "James", "Mike", "John")){
  df = data.frame(names = names, MATH = numeric(length(names)), PHYS = numeric(length(names)), ENGL = numeric(length(names)))
  df = edit(df)
}

pie(as.numeric(success()[,-1][3,])-1, labels=names(success())[-1])



function_analys= function(funct="(3*x^2-30*x+74.417)/(x-5)"){
  f = parse(text=funct)
  df = D(f, 'x')
  f2 = function(x) eval(f, list(x=x))
  df2 = function(x) eval(df, list(x=x))
  root = uniroot(f2, lower=-100, upper=100)
  x=seq(-50, 50, length=500)
  plot(x, f2(x), type = 'l')
  lines(x, df2(x), type = 'l')
  return(root$root)
}
function_analys("x^3-18*x^2+106.25*x-205.5")

library(rgl)

f3 = function(){
  a=1
  b=2
  x<-y<-seq(-2, 2, length=1000)
  z=3
  M = outer(x, y, function(x, y) abs(x^2/a^2+y^2/b^2-1)<10e-3)
  persp3d(x, y, M*z, zlim = c(1, z-1), xlab="x", ylab="y", zlab="z", box=FALSE)
}

f4 = function(){
  a=2
  b=1
  x<-y<-seq(-5,5, length=500)
  z=3
  M = outer(x, y, function(x, y) abs(x^2/a^2-y^2/b^2-1)<10e-2)
  persp3d(x, y, M*z, zlim = c(1, z-1), xlab="x", ylab="y", zlab="z", box=FALSE)
}


dens=300
x=seq(-3, 5, length=dens+1)
y=seq(-5, 5, length=dens+1)
z=seq(-5, 5, length=dens+1)

f5 = function(x, y, z) {
  R=2
  r=1
  M=matrix(numeric(0), ncol=3)
  for (xi in x){
    for (yi in y) {
     for (zi in z) {
       if(abs((xi^2+yi^2+zi^2+R^2-r^2)^2-4*R^2*(xi^2+yi^2))<50e-2){
         M = rbind(M, c(xi, yi, zi))
        # print("HI")
       }
     } 
    }
  }
  return(M)
    
  
}
k=f5(x, y, z)
points3d(k)

dens=100
x=seq(-5, 5, length=dens+1)
y=seq(-5, 5, length=dens+1)
z=seq(-5, 5, length=dens+1)
f6 = function(x, y, z, a, b, c) {

  M=matrix(numeric(0), ncol=3)
  for (xi in x){
    for (yi in y) {
      for (zi in z) {
        if(abs(xi^2/a^2+yi^2/b^2-zi^2/c^2-1)<10e-2){
          M = rbind(M, c(xi, yi, zi))
          # print("HI")
        }
      } 
    }
  }
  return(M)
  
  
}
k=f6(x, y, z, 3, 4, 5)
points3d(k)

f7 = function(){
  r=10
  R=15
  t <- seq(0, 2*pi, length.out=500); 
  u <- seq(0, 2*pi, length.out=500); 
  xm<-outer(t,u,function(t, u)cos(t)*(R+r*cos(u)))
  ym<-outer(t,u,function(t, u)sin(t)*(R+r*cos(u)))
  zm<-outer(t,u,function(t, u) r*sin(u))
  surface3d(xm, ym, zm)
}

f8 = function(a=2, b=2, c=3){
  t <- seq(0, 2*pi, length.out=500); 
  u <- seq(-pi, pi, length.out=500); 
  xm<-outer(t,u,function(t, u)a*cosh(u)*cos(t))
  ym<-outer(t,u,function(t, u)b*cosh(u)*sin(t))
  zm<-outer(t,u,function(t, u)c*sinh(u))
  #surface3d(xm, ym, zm)
  persp3d(xm, ym, zm)
}
f8()

f9 = function(a=1, b=1){
  t <- seq(-2*pi, 2*pi, length.out=150); 
  u <- seq(-2*pi, 2*pi, length.out=150); 
  xm<-outer(t,u,function(t, u)a*cosh(u))
  ym<-outer(t,u,function(t, u)b*sinh(u))
  zm<-outer(t,u,function(t, u)t)
  surface3d(xm, ym, zm)
}
f9()