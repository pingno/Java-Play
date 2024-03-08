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