def operatorChoices(a,b,c):
    if c==1:
       return a+b
    elif c==2:
       return a-b
    elif c==3:
      return a*b
    elif c==4:
      return int(a/b)

      
c=int(input())
a=int(input())
b=int(input())
op=operatorChoices(a,b,c)
print(op)