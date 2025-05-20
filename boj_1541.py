expression = input()

parts = expression.split('-')

initial = sum(map(int, parts[0].split('+')))

others = 0
for part in parts[1:]:
    others += sum(map(int, part.split('+')))

print(initial - others)