A = int(input("Enter a positive integer: "))
sum = 0
for i in range(1, A + 1):
    if i % 2 != 0:
        sum += i
print(sum)
