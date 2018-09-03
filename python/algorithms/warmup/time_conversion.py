from time import strptime, strftime

time = strptime(input(), "%I:%M:%S%p")
print(strftime("%H:%M:%S", time))
