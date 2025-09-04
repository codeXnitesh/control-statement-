# n = int(input())
# for i in range(3, n+3):
#     for j in range (n-1):
#         if j==3:
#             print("*", end="")
#         else:
#             print("*", end="")
#     print()  

N = int(input())
for i in range(1, N + 1):
    for j in range(N - i):
        if j == 3:
            print("*", end="")
        else:
            print("*", end="")
    print()          
