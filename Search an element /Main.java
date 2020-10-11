def num_index(numlist,what_num):
  if what_num not in numlist:
       print("-1")
  else:
      for i in range(len(numlist)):
          if numlist[i]==what_num:
             print("index =",i)


n=int(input())
numlist=list(map(int,input().rstrip().split()))
what_num=int(input())
num_index(numlist,what_num)
             