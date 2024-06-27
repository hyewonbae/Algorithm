n, k = map(int,input().split())
coin = [0]*n
for i in range(n) :
  coin[i] = int(input())
count = 0
temp = 0

for i in range(n-1,-1,-1) :
  if coin[i] <= k :
    temp = k//coin[i]
    count += temp
    k -= temp*coin[i]
print(count)