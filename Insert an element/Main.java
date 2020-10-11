def insert_element(arr,pos,val):
  arr.insert(pos-1,val)
  for _ in range(len(arr)):
      print(arr[_],end=" ")
  
n=int(input())
arr=list(map(int,input().rstrip().split()))
pos,val=map(int,input().split())
insert_element(arr,pos,val)