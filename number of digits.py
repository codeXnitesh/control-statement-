n= int(input("Enter a number"))
count=0
if n==0:
   count=1
else:
    while n>0:
     n//=10 #remove the lastr digit of n
     count+=1
print("number of digits", count )