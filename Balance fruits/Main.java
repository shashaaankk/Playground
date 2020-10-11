def Balancefruits(a,m,rs):
    if a>m:
       rs=rs-(a-m)*1
    elif a<m:
       rs=rs+(m-a)*1
    return rs
       
       

a,m,rs=map(int,input().split())
op=Balancefruits(a,m,rs)
print(op)
  