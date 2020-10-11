def convertpalindrome(ip):
    if ip!=ip[::-1]:
      for i in range(len(ip)):
          if ip[i]==ip[-1]:
              break
      return(ip[0:i][::-1])
    elif ip==ip[::-1]:
         return("NULL")
ip=input()
print(convertpalindrome(ip))