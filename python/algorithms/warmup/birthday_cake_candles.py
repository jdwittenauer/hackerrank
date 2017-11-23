n = int(raw_input().strip())
a = [int(x) for x in raw_input().strip().split(' ')]
candles = list(filter(lambda y: y == max(a), a))
print(len(candles))
