class Mammal:
    def __init__(self, name, age, hunger):
        self.name = name
        self.age = age
        self.hunger = hunger

    def walk(self):
        print("Walk")

    def feed(self, amount):
        self.hunger += amount

    def deplete(self, amount):
        self.hunger -= amount


class Dog(Mammal):
    pass


class Cat(Mammal):
    pass


dog1 = Dog("Jeremy", 4, 100)
dog1.feed(50)
print(dog1.hunger)
dog1.deplete(150)
print(dog1.hunger)

cat1 = Cat("Sammy", 5, 0)
cat1.feed(50)
print(cat1.name + " is " + str(cat1.age) + " years old, and is hungry for " + str(cat1.hunger) + " amount.")
