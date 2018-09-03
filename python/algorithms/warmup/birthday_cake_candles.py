n = int(input().strip())
a = [int(x) for x in input().strip().split(' ')]
candles = list(filter(lambda y: y == max(a), a))
print(len(candles))
