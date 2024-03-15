/*
Java Switch Statements

instead of writing many if..else statements, you can use the switch statement

The switch statement selects one of many code blocks to be executed:
 */

 switch(expression) {
    case x:
    // code block
        break;
    case y:
    // code block
        break;
    default:
    // code block
        
 }


 int day = 4;
 switch (day){
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    default:
        System.out.println("Some other day in the week")
 }


 // break is used to break out of the switch block

 //Java While Loops

 int i = 0;
 while (i < 5) {
    System.out.println(i);
    i++
 }


 // the do/while loop is a variant of the while loops
 // this will execute the code block once, before checking if the the condition is true
 // then it will repeat the loop as long as the condition is true

 int x = 0;
 do {
    System.out.println(i);
    i++;
 }
 while (x < 5);



 for (int = 0; i < 10; i = i + 2) {
    if (i == 4) {
        break;
    }
    System.out.println(i);
 }

 //break will break out of the for loops


 for (int j = 0; j < 10; j++){
    if (j == 4) {
        continue;
    }
    System.out.println(j)
 }

 //continue will move on to next iteration of loop