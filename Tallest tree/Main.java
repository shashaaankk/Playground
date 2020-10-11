def HeightofTree(trees):
    tallest=0
    heights=[]
    for tree in trees:
        height=tree[0]*12+tree[1]
        heights.append(height)
    print(max(heights))
        
      
n=int(input())
trees=[]
for i in range(n):
    x=list(map(int,input().split()))
    trees.append(x)
HeightofTree(trees)