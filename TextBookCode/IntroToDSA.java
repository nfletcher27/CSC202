// Chapter 1 of DSA
class thermostat {
  private float currentTemp();
  private float desiredTemp();
  
  public void furnace_on() {
    // method body for activity
  }
  
  public void furnace_off() {
    // method body for activity
  }
} // end class thermostat

thermostat therm1; threrm2;

therm1 = new thermostat();
therm2 = new thermostat();

therm2.furnace_on(); // accessing

// arguments
void method1() {
  BankAccount ba1 = new BankAccount(350.00);
  method2(ba1);
}

void method2(BankAccount acct) {
}

// Arrays
int[] intArray = new int[100]; // creates and assigns size to new array

temp = intArray[3];
intArray[7] = 66;

class Person {
  private String lastName;
  private String firsteName;
  private int age;
  
  public Person(String last, String first, int a) {
    lastName = last;
    firstName = first;
    age = a;
  }
  
  public void displayPerson() {
    System.out.print("  Last name: " +lastName);
    System.out.print(" First name:" + firstName);
    System.out.println(", Age: " + age);
  }
  
  public String getLast() {
    return lastName;
  }
