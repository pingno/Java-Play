// AccessModifier ReturnType methodName(ParameterType1 paramName1, ParameterType2 paramName2, ...) {
//     // Method body
//     // Perform actions here
//     // Optionally return a value using the return keyword
// }
public class MyClass {
    //Method 1
    public static void sayHello() { //static method (tied to class, not instance) returns void if misused
        System.out.println("Hello!")
    }

    //Method 2
    public static int add(int a, int b) {
        return a + b;
    }

    public static void printSquare(int num) {
        System.out.println("Square of " + num + " is: " + (num * num));
    }

    public static void main(String[] args) {
        sayHello(); // Call Method 1;
        int sum = add(5,3); // Call Method 2
        System.out.println("Sum: " + sum);
        printSquare(4); // Call Method 3
    }

}


public int subtract(int num1, int num2) {
    int sum = num1 - num2;
    return sum
}


// AccessModifier class ClassName {
//     // Fields (variables)
//     // Constructors
//     // Methods
// }

// Example:
public class MyClass {
    // Fields
    private int field1;
    private String field2;

    // Constructor
    public MyClass(int field1, String field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    // Method
    public void displayFields() {
        System.out.println("Field 1: " + field1);
        System.out.println("Field 2: " + field2);
    }
}