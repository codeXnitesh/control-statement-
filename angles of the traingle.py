angle1 = int(input("Enter first angle: "))
angle2 = int(input("Enter second angle: "))
angle3 = int(input("Enter third angle: "))

if angle1 + angle2 + angle3 == 180:
    if 90 in [angle1, angle2, angle3]:
        print("Right triangle")
    elif any(angle > 90 for angle in [angle1, angle2, angle3]):
        print("Obtuse triangle")
    else:
        print("Acute triangle")
else:
    print("Invalid triangle")
