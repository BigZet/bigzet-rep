
sol <- function(n, A, f, u0, n_iter=10e5, eps=10e-7){
  counter = 0
  max_v=max(A, f)
  dim(A)=c(n, n)
  print(dim(A))
  print(A)
  print(f)
  A=A/max_v
  f=f/max_v
  print(A)
  print(f)
  I=ifelse(row(A)==col(A), 1, 0)
  B=I-A
  print(B)
  repeat{
    u1 = B%*%u0 + f
    counter = counter + 1
    if(max(abs(u1-u0))<=eps | counter>n_iter) break
    u0=u1
  }
  print(u1)
  return(u1)
}

check_maj_d <- function(A){
  diag_e = A[row(A)==col(A)]
  checker = 2*abs(diag_e)-rowSums(abs(A))>0
  #print(checker)
  return(!(FALSE %in% checker))
}

SIM = function(n, A, f, u0, n_iter=10e5, eps=10e-7){
  tryCatch({
    stopifnot(check_maj_d(A), is.numeric(A), is.numeric(f), n_iter>0,
              eps>0, n>=2)
    sol(n, A, f, u0, n_iter=10e5, eps=10e-7)
  },
    error=function(e){
      print(e$message)
    }
    )
}

A = matrix(c(10, -1, 2, 0, -1, 11, -1, 3, 2, -1, 10, -1, 0, 3, -1, 8), nrow = 4, byrow = T)
f = c(6, 25, -11, 15)



SIM(nrow(A), A, f, rnorm(nrow(A)), 100, -1)
check_maj_d(A)