# Variable types
# This program takes two numbers are returns whether their product is <, =, > 50

number1 = int(input("Please enter a number: "))
number2 = int(input("Enter another number: "))

if number1*number2 < 50:
    print("The numbers you gave were " + str(number1) + " and " + str(number2) + " and their product is " + str(number1*number2) + " which is less than 50")
else:
    print("The numbers you gave were " + str(number1) + " and " + str(number2) + ", and their product is " + str(number1*number2) + ", which is equal to or greater than 50")


