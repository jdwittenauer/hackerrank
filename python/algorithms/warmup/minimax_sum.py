import sys

a = [int(x) for x in raw_input().strip().split(' ')]
min_val, max_val = sys.maxint, 0

for i in range(len(a)):
    sum_val = sum(a[:i]) + sum(a[i+1:])
    min_val = sum_val if sum_val < min_val else min_val
    max_val = sum_val if sum_val > max_val else max_val

print('{0} {1}'.format(min_val, max_val))
