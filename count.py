N = int(input("Enter an integer: "))
count = 0
while N > 0:
    count += 1
    N //= 10
print(count)
