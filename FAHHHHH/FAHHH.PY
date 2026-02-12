n=6
p = 6
for i in range(n):
  for j in range(i+1):
    print(p,end="")
  p-= 1
  print()