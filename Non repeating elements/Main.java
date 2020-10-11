def common_nums(n_list,m_list):
  count=0
  for n_num in n_list:
      if n_num not in m_list:
          count+=1
          print(n_num,end=" ")
  for m_num in m_list:
      if m_num not in n_list:
          count+=1
          print(m_num,end=" ")
  print()
  print(count)


n,m=map(int,input().split())
n_list=list(map(int,input().rstrip().split()))
m_list=list(map(int,input().rstrip().split()))        
common_nums(n_list,m_list)