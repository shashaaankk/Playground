def calculate(n,m):
    tot=0
    for num in range(n,m+1):
      if num%3==0 and num%5==0:
        tot+=num
    print(tot)
  
n=int(input())
m=int(input())
calculate(n,m)