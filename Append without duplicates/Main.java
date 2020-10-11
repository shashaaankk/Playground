arr=[]
while 1:
  n=int(input())
  
  if n<0:
    #print("List is empty")
    break
  
  if n not in arr:
    arr.append(n)
    
for i in range(len(arr)):    
    print(arr[i])
if len(arr)==0:
  print("List is empty")