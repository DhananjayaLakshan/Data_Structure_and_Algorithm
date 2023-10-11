def Fibonacci(n):
    if n <= 1:
        return n
    else:
        return Fibonacci(n-1) + Fibonacci(n-2)

while(True):
    number = int(input("Eneter an Integer: "))

    if(number == -1):
        break

    else:
        fibonacci = Fibonacci(number)
        print("Fibonacci of ",number, "is", fibonacci)

