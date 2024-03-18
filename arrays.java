/*
Java Arrays

Arrays are used to store multiple values in a single variable,
instead of declaring separate variables for each value.

To declare an array, define the variable type with square brackets:
 */

 String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
 //We have now declared a variable that holds an array of strings
 //To insert values to it, you can play the values in a comma-separated list, inside curly braces

 int[] myNum = {10, 20, 30, 40}


 System.out.println(cars[0]) //outputs Volvo
 System.out.println(myNum[3]) //outputs 40


 //change the value of an array
 cars[0] = "Integra"
 System.out.println(cars[0]) //Integra

 //length of array
 System.out.println(cars.length) //outputs 4


//loop through an array
for(int i = 0; i < cars.length; i++) { //remember java uses int not let like javascript
    System.out.println(cars[i])
}

//loop th rough an array with For-Each

/*
Syntax

for (type variable : arrayname) {

}
 */

 for (String i : cars) {
    System.out.println(i)
 }

 //for each String element (called i - as in index) in cars, print out the value of i.


 // MULTI DIMENSIONAL ARRAYS

 /*
A multidimensional array is an array of arrays
they are useful when you want to store data as a tabular form, like a table with rows and columns
To create a two-dimensional array, add each array within its own set of curly braces:
  */

int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7}}

System.out.println(myNumbers[1][2]) //Outputs 7

//Change elemnts
myNumbers[1][2] = 9;
System.out.println(myNumbers[1][2]); // Outputs 9 instead of 7

//Loop through a multi-dimensional array

public class Main {
    public static void main(String[] args) {
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for {int i = 0; i < myNumbers.length; ++i}{
            for (int j = 0; i < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j])
            }
        }
    }
}

// Java pre increment ++i
// Java post increment i++