num = int(input())
for _ in range(num):
    n = int(input())
    if n == 1:
        print(1) 
        continue
    elif n == 2:
        print(2)  
        continue
    elif n == 3:
        print(4) 
        continue

    co = [1, 2, 4] + [0] * (n - 3) 
    for i in range(4, n + 1):
        co[i - 1] = co[i - 2] + co[i - 3] + co[i - 4]
    print(co[n - 1])