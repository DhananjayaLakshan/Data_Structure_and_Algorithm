def Multiply(M,n):
    if n==1:
        return M
    else:
        return (M + Multiply(M,n-1))

while(True):
    M = int(input("Eneter an Integer (M): "))

    if(M == -1):
        break

    n = int(input("Eneter an integer (n):"))

    print("Multiplication of",M,"&",n,"is = ", Multiply(M,n))
