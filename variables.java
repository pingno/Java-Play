System.out.println("Hello World")


// Java Variables
// - variables are containers for storing data values

// In Java, there are different types of variables, for example

// String - stores, text, such as "Hello",  String values are surrounded by double quotes
// int - stores integers (whole numbers), without decimals, such as 123 or -123
// float - stores floating point numbers, with decimals
// char - stores single characters such as 'a' or 'B'.  Char values are surrounded by single quotes
// boolean - stores values with two states: true or false


// Declaring (Creating) Variables

// To create a variable, you must specify the type and assign it a value:
// type variableName = value;

String name = "John";
System.out.println(name); //John


String firstName = "Timmy"
String lastName = "Turner"
String fullName = firstName + lastName;
System.out.println(fullname)



int myNum = 15;
System.out.println(myNum); //15


public class Main {
    public static void main(String[] args) {
      int myNum;
      myNum = 15;
      System.out.println(myNum);
    }
  }
  

// FINAL VARIABLES
// - if you don't want others to overwite existing values (unchangeable and read-only)

final int myNum3 = 35;
// reassigning will generate an error

int myNum4 = 5;
float myFloatNum = 5.99f;
char myLetter = 'D';
boolean myBool = true;
String myText = "Hello";



int x = 5
int y = 6
System.out.println(x + y) // Print the value of x + y


// Declaring multiple variables
// comma seperated list

int a = 1, b = 2, c = 3;
System.out.println(x + y + z)

// one value to multiple variables

int x, y, z;
x = y = z = 50