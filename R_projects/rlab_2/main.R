#First part
#1st task

matrix = array(3, dim = c(3, 4))
indexes = cbind(c(1, 2, 3, 3), c(3, 1, 2, 4))
values = c(4, 1, NA, 1)
matrix[indexes] = values
print(matrix)

#2nd task
a <- c(1, 3, 4, 9, NA)
b <- c(5, 6, 7, 0, 2)
c <- c(9, 10, 13, 1, 20)
clmn = cbind(a, b, c)
rw = rbind(a, b, c)
rownames(rw) = paste0("row", 1:3)
colnames(rw) = paste0("col", 1:5)
print(clmn)
print(rw)

#3rd task
names <- c("Jane", "Michael", "Mary", "George")
ages <- c(8, 6, 28, 45)
gender <- c(0, 1, 0, 1)
cbind(names, ages, gender)
print("Матрица, как и вектор не может содержать данные различных типов")

#Second part
#solveMatrix
mat = diag(c(4, 9))
rownames(mat) = paste0("eq", 1:2)
colnames(mat) = paste0("x", 1:2)
print(eigen(mat)$values)
B = diag(1, 2, 2)-mat
print(B)
f = c(4, 2)
u = c(0.2, -0.3)

x=solve(mat)%*%f
u2=B%*%u+f
u3=B%*%u2+f
u4=B%*%u3+f
u5=B%*%u4+f
u6=B%*%u5+f
u7=B%*%u6+f

A = mat

AA = A/max(A)
ff = f/max(A)

eigen(AA)
f=ff
mat=AA
B = diag(1, 2, 2)-mat
x=solve(mat)%*%f
uu2=B%*%u+f
uu3=B%*%uu2+f
uu4=B%*%uu3+f
uu5=B%*%uu4+f
uu6=B%*%uu5+f
uu7=B%*%uu6+f

#slices_1
step <- 1               # Шаг сетки
dekart_begin <- -5      # Начало сетки
dekart_end <- 5         # Конец сетки


# Задание сеточной поверхности
x <- seq(from = dekart_begin, to = dekart_end, by = step)
y <- x

# Задание двумерной функции на координатной сетке
surface_matrix <- outer(X = x, 
                        Y = y, 
                        FUN = function(x,y) Re(exp(-1i * 0.5  * x * y)))
dimnames(surface_matrix) <- list(x, y)

cat("Количество элементов матрицы(", length(surface_matrix), ")\n", 
              "Размерность строк (", dim(surface_matrix)[1], ")\n", 
              "Размерность столбцов (", dim(surface_matrix)[2], ")\n", 
              "Сумма элементов главной диагонали(", sum(surface_matrix[cbind(1:11, 1:11)]), ")\n", 
              "Сумма элементов серединного среза матрицы по строкам(", sum(surface_matrix[median(1:11), ]), ")\n",
              "Сумма элементов серединного среза матрицы по столбцам(", sum(surface_matrix[, median(1:11)]), ")\n",
              "Сумма строк матрицы (", rowSums(surface_matrix) , ")\n",
              "Сумма столбцов матрицы (", colSums(surface_matrix), ")\n", file = "summary.txt"
              
              )

#slices_2
step <- as.numeric(readline())               # Шаг сетки
dekart_begin <- as.numeric(readline())     # Начало сетки
dekart_end <- as.numeric(readline())         # Конец сетки


# Задание сеточной поверхности
x <- seq(from = dekart_begin, to = dekart_end, by = step)
y <- x

# Задание двумерной функции на координатной сетке
surface_matrix <- outer(X = x, 
                        Y = y, 
                        FUN = function(x,y) Re(exp(-1i * 0.5  * x * y)))
dimnames(surface_matrix) <- list(x, y)

cat("Количество элементов матрицы(", length(surface_matrix), ")\n", 
    "Размерность строк (", dim(surface_matrix)[1], ")\n", 
    "Размерность столбцов (", dim(surface_matrix)[2], ")\n", 
    "Сумма элементов главной диагонали(", sum(surface_matrix[cbind(1:length(surface_matrix[1,]), 1:length(surface_matrix[,1]))]), ")\n", 
    "Сумма строк матрицы (", rowSums(surface_matrix) , ")\n",
    "Сумма столбцов матрицы (", colSums(surface_matrix), ")\n", file = "summary_2.txt"
)


#slices_3
write("1 -5 6 1 -5 5", "input.txt")
text = strsplit(readLines("input.txt"), " ") 
step <- as.numeric(text[[1]][1])             # Шаг сетки
dekart_begin <- as.numeric(text[[1]][2])     # Начало сетки
dekart_end <- as.numeric(text[[1]][3])
step_y <- as.numeric(text[[1]][4])             # Шаг сетки
dekart_begin_y <- as.numeric(text[[1]][5])     # Начало сетки
dekart_end_y <- as.numeric(text[[1]][6])    # Конец сетки


# Задание сеточной поверхности
x <- seq(from = dekart_begin, to = dekart_end, by = step)
y <- seq(from = dekart_begin_y, to = dekart_end_y, by = step_y)

# Задание двумерной функции на координатной сетке
surface_matrix <- outer(X = x, 
                        Y = y, 
                        FUN = function(x,y) Re(exp(-1i * 0.5  * x * y)))
dimnames(surface_matrix) <- list(x, y)

cat("Количество элементов матрицы(", length(surface_matrix), ")\n", 
    "Размерность строк (", dim(surface_matrix)[1], ")\n", 
    "Размерность столбцов (", dim(surface_matrix)[2], ")\n", 
    "Сумма элементов главной диагонали(", sum(surface_matrix[cbind(seq(1, length(surface_matrix[1,])), seq(1, length(surface_matrix[1,])))]), ")\n", 
    "Сумма строк матрицы (", rowSums(surface_matrix) , ")\n",
    "Сумма столбцов матрицы (", colSums(surface_matrix), ")\n", file = "summary_3.txt"
)

#matrixes

cars_matrix <- as.matrix(cars)
cars_speed<-cbind(1, cars_matrix[,1])
cars_dist <- cars_matrix[, 2]
A = cars_speed
a = solve(t(A)%*%A)%*%t(A)%*%cars_dist
a = as.vector(a)
a_c = a[1]
a_x = a[2]
print(paste("alpha_c =", a_c))
print(paste("alpha_x =", a_x))
cars_speed_lm = cars_matrix[,1]
cars_dist_lm = a_c + cars_speed_lm * a_x
dist_residuals = cars_dist_lm - cars_dist
dred_mn = mean(dist_residuals)
dred_sd = sd(dist_residuals)
plot(cars)
lines(x = cars_speed_lm, y = cars_dist_lm)
print(paste("dist_res_mean:", dred_mn, "dist_res_sd:", dred_sd))

