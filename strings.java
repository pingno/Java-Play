String greeting = "Hello World"
System.out.println(greeting)

//String Length
//A String in Java is actually an object, which contain methods that can perform certain operations on strings. For example, the length of a string can be found with the length() method:

String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
System.out.println("The length of the txt string is: " + txt.length());


System.out.println(greeting.toUpperCase());
System.out.println(greeting.toLowerCase());

System.out.println(greeting.indexOf("World")) // Outputs 6


String firstName = "John";
String lastName = "Doe";
System.out.println(firstName + " " + lastName)
System.out.println(lastName.concat(firstName))



String x = "10";
int y = 20;
String z = x + y; // Outputs z will be 1020 (a string)


/*
The backslash (\) escape character turns special characters into string characters:

Escape character	Result	Description
\'	'	Single quote
\"	"	Double quote
\\	\	Backslash
The sequence \"  inserts a double quote in a string:

 */


 // The sequence \| inserts a double quote in a string
 String txt = "We are the so-called \"Vikings\" from the north. "

 // The sequence \' inserts a single quote in a string:

 String txt2 = "It\'s alright.";

 // The sequence \\ inserts a single backslash in a string:

 String txt3 = "The character \\ is called backslash.";