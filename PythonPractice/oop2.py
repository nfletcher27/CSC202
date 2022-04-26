class Pet:

    def __init__(self, name, age):
        self.name = name
        self.age = age

    def show(self):
        print(f"I am {self.name} and I am {self.age} years old")


class Cat(Pet):

    # Inheritance to add new attributes to similar classes that need additional data fields
    def __init__(self, name, age, color):
        super().__init__(name, age)
        self.color = color

    def speak(self):
        print("Meow")


class Dog(Pet):

    def bark(self):
        print("Bark")


p = Pet("Bob", 32)
p.show()
c = Cat("Randy", 19, "White")
c.show()


class Fish(Pet):
    pass


f = Fish("Marlin", 12)
f.show()


class Person:
    number_of_persons = 0
    gravity = -9.8

    @classmethod
    def number_of_people(cls):
        cls.number_of_people += 1

    def __init__(self, name, age):
        self.age = age
        self.name = name


Person.number_of_people = 29
p1 = Person("Jeff", 26)
print(p1.number_of_people)


class Math:

    @staticmethod
    def add5(x):
        return x + 5

    @staticmethod
    def pr():
        print("Example of static method")
        

print(Math.add5(2))

