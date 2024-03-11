// Java Data Types

// As explained in the previous chapter, a variable in Java must be a specified data type:

int myNum = 5; // integer (whole number)
float myFloatNum = 5.99f;  //floating point number
char myLetter = 'D'; // Character
boolean myBool = true; // Boolean
String myText = 'Hello';  // String

/* Primitive Data Types
 
A primitive data type specifies the size and type of variable values, and it has no additional methods.
There are 8 primitive data types in Java:

Data Type	Size	Description
byte	1 byte	Stores whole numbers from -128 to 127
short	2 bytes	Stores whole numbers from -32,768 to 32,767
int	4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
float	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
boolean	1 bit	Stores true or false values
char	2 bytes	Stores a single character/letter or ASCII values

 */


 // Numbers
 
 /*

 Primitive number types are divided into two groups:

 Integer types stores whole numbers, positive or negative (such as 123 or -456), without decimals.
 Valid types are byte, short, int and long.  Which type you should use, depends on the numeric value.

 Floating point types represents numbers with a fractional part, containing one or more decimals.

 There are two types: float and double.
  */


byte myNum2 = 100;  // can store whole numbers from -128 to 127
System.out.println(myNum2); // 100

short myNum3 = 5000;
System.out.println(myNum3); // short can store whole numbers from -32768 to 32767

int myNum4 = 100000;
System.out.println(myNum4) // The int data type can store whole numbers from -2147483648 to 2147483647

long myNum5 = 1500000000L; // must end in L
System.out.println(myNum5) // The long data type can store whole numbers from -9223372036854775808 to 9223372036854775807

float myNum6 = 5.75f;
System.out.println(myNum);

double myNum7 = 19.99d;
System.out.println(myNum);

// Scientific Numbers
// A floating point number can also be a scientific number with an "e" to indicate the power of 10:

// Example
float f1 = 35e3f;
double d1 = 12E4d;
System.out.println(f1);
System.out.println(d1);



//Boolean types

boolean isJavaFun = true;
boolean isFishTasty = false;
System.out.println(isJavaFun) // true
System.out.println(isFishTasty) //false

// Characters
// data type to store single characters.  must be surrounded by single quotes

char myGrade = 'B';
System.out.println(myGrade);

char myVar1 = 64, myVar2 = 65, myVar3 = 66;
System.out.println(myVar1, myVar2, myVar3);


// Strings
// must be surrouded by double quotes;

String greeting = "Hello World"
System.out.println(greeting)

/*
Non-Primitive Data Types
Non-primitive data types are called reference types because they refer to objects.

The main difference between primitive and non-primitive data types are:

Primitive types are predefined (already defined) in Java. Non-primitive types are created by the programmer and is not defined by Java (except for String).
Non-primitive types can be used to call methods to perform certain operations, while primitive types cannot.
A primitive type has always a value, while non-primitive types can be null.
A primitive type starts with a lowercase letter, while non-primitive types starts with an uppercase letter.
Examples of non-primitive types are Strings, Arrays, Classes, Interface, etc. You will learn more about these in a later chapter.
 */