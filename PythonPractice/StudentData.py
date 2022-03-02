numberOfStudents = input("How many student records would you like to fill out? (1 - 5)")
cont = True

while cont == True:
    if int(numberOfStudents) == 0:
        print("You sure? Might wanna do at least 1.")
        numberOfStudents = input("How many student records would you like to fill out? (1 - 5)")

    elif int(numberOfStudents) > 0 and int(numberOfStudents) < 6:
        print("Great!")
        studentList = [];
        
        for i in range(int(numberOfStudents)):
            student = {"ID": "StudentID", "Name": "StudentName", "GPA": "StudentGPA"}
            student["ID"] = input("Enter ID of student #" + str(i + int(1)))
            student["Name"] = input("Enter name of student #" + str(i + int(1)))
            student["GPA"] = input("Enter GPA of student #" + str(i + int(1)))
            studentList.append(student.get("ID") + "  " + student.get("Name") + "  " + student.get("GPA"))
        print("Student ID : Student Name : Student GPA - Student Records of Fletcher University")
        
        for i in range(len(studentList)):
            print(studentList[i])
        cont = False
        
    else:
        print("That's too many, try again!")
        numberOfStudents = input("How many student records would you like to fill out? (1 - 5)")

input("Press any key to stop program")
