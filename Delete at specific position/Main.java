def deleteNum(arr,x):
    arr.remove(arr[x-1])
    for i in range(len(arr)):
        print(arr[i],end=" ")
    
n=int(input())
arr=list(map(int,input().split()))
x=int(input())
deleteNum(arr,x)