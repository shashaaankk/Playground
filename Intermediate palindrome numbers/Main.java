def is_palindrome(i):
    forw=str(i)
    rev=forw[::-1]
    if forw==rev:
       return True
    return False
  
m=int(input())
n=int(input())
for i in range(m,n+1):
    if(is_palindrome(i)):
      print(i,end=" ")
      