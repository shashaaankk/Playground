def decimal_binary(num):
    res=[]
    while(num>=1):
          b=num%2
          res.append(b)
          num=int(num/2)
    for i in reversed(range(len(res))):
         print(res[i],end="")
n=int(input())
decimal_binary(n)