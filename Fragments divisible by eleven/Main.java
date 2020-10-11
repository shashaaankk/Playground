def DivisibilityByEleven(num):
    count=0
    strnum=str(num)
    length=len(strnum)
    for frag in range(2,length+1):
        for index in range(length+1):
             x=strnum[index:frag+index]
             if len(x)==frag:
                x=int(x)
                if x%11==0:
                   count+=1
    print(count)
      
  
  
num=int(input())
DivisibilityByEleven(num)