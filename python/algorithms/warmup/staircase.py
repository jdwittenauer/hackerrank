n = int(raw_input().strip())
for i in range(n):
    spaces = ''.join([' ' for _ in range((n - 1) - i)])
    pounds = ''.join(['#' for _ in range(i + 1)])
    print(spaces + pounds)
