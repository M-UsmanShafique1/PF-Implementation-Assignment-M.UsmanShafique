a = float(input("Enter first number: "))
b = float(input("Enter second number: "))
c = float(input("Enter third number: "))
d = float(input("Enter fourth number: "))
maximum = a

if b > maximum:
    maximum = b
if c > maximum:
    maximum = c
if d > maximum:
    maximum = d
print("The maximum number is:", maximum)
