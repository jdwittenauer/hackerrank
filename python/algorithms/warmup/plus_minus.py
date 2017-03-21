n = int(raw_input().strip())
a = [int(x) for x in raw_input().strip().split(' ')]

pos, neg, zero = 0, 0, 0
for x in a:
    if x > 0:
        pos += 1
    elif x < 0:
        neg += 1
    else:
        zero += 1

print(float(pos) / n)
print(float(neg) / n)
print(float(zero) / n)
