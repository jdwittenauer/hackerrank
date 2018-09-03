n = int(input().strip())
a = []

for _ in range(n):
    temp = [int(row) for row in input().strip().split(' ')]
    a.append(temp)

diag_1 = sum([a[x][x] for x in range(n)])
diag_2 = sum([a[x][(n - 1) - x] for x in range(n)])

print(abs(diag_1 - diag_2))
