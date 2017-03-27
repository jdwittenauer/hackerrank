from time import strptime, strftime

time = strptime(raw_input(), "%I:%M:%S%p")
print strftime("%H:%M:%S", time)
