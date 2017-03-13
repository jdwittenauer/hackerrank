a = raw_input().strip().split(' ')
a = map(lambda x: int(x), a)
b = raw_input().strip().split(' ')
b = map(lambda x: int(x), b)

a_score = 0
b_score = 0

for ax, bx in zip(a, b):
    if ax > bx:
        a_score += 1
    elif bx > ax:
        b_score += 1

print(str(a_score) + ' ' + str(b_score))
