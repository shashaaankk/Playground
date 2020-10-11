def tableOfNumbers(n):
    summ=0
    for i in range(1,11):
        x=i*n
        summ+=x
        print(x,end=" ")
    print()
    print(summ)
ip=int(input())
tableOfNumbers(ip)