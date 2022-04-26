class Dog:

    def __init__(self, name, age, breed):
        self.name = name
        self.age = age
        self.breed = breed

    def get_name(self):
        return self.name

    def get_age(self):
        return self.age

    def get_breed(self):
        return self.breed

    def bark(self):
        print("bark")

    def add1(self, x):
        return x + 1

    def print_dog_info(self):
        print(self.name + " is " + str(self.age) + " months old and is a " + self.breed)

    def change_dog_info(self, name, age, breed):
        self.name = name
        self.age = age
        self.breed = breed


d = Dog("Ben", 12, "Border Collie")
d2 = Dog("Randy", 9, "German Sheperd")
print(type(d))
print(d2.print_dog_info())
print(d.print_dog_info())
d.change_dog_info("Mark", 83, "Labrador")
print(d.print_dog_info())


class Student:

    def __init__(self, name, age, grade):
        self.name = name
        self.age = age
        self.grade = grade

    def get_grade(self):
        return self.grade


class Course:

    def __init__(self, name, max_students):
        self.name = name
        self.max_students = max_students
        self.students = []

    def add_students(self, student):
        if len(self.students) < self.max_students:
            self.students.append(student)
            return True
        return False

    def get_average_grade(self):
        value = 0
        for student in self.students:
            value += student.get_grade()
        return value/len(self.students)


s1 = Student("Jim", 18, 95)
s2 = Student("Roger", 16, 79)
s3 = Student("Mary", 19, 88)

course = Course("History", 2)
course.add_students(s1)
course.add_students(s2)
course.add_students(s3)

print(course.students[1].name)
print(course.get_average_grade())
