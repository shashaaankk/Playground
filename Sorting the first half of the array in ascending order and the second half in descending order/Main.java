length=int(input())
half=int(length/2)
N=list(map(int,input().split()))
#N.sort()
first_half=[]
second_half=[]
for count in range(half):
    first_half.append(N[count])
first_half.sort()
for count in range(half,length):
    second_half.append(N[count])
second_half.sort(reverse=True)

if length%2==0:
    for count in range(half):
        first_half.append(second_half[count])
    for i in range(len(first_half)):
        print(first_half[i],end=" ")
else:
    for count in range(half+1):
        first_half.append(second_half[count])
    for i in range(len(first_half)):
        print(first_half[i],end=" ")

