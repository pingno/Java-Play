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