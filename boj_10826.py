num = int(input())
mem = [0, 1] + [-1] * (num - 1)

for i in range(2, num + 1):
    mem[i] = mem[i - 1] + mem[i - 2]
print(mem[num])