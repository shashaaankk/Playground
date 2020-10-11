def binary_decimal(num):
    eq=0
    for i in range(len(num)):
        x=(len(num)-1)-i
        eq+=int(num[i])*(2**x)
    print(eq)
    
n=input()
binary_decimal(n)