


            

# n = int(input("Enter number of rows: "))
# for i in range(1, n + 1):
#     for j in range(1, i + 1):
#         if j == 1 or j == i:
#             print("*", end=" ")
#         else:
#             print("_", end=" ")
#     print()


n = int(input("Enter  numner of rows: "))
for i in range(1, n+1):
    for j in range(1,i+1):
        if j==1 or j==i:
            print("*", end=" ")
        else:
            print("___", end="")
                
    print()        