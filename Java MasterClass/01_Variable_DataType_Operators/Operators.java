public class Main{
    public static void main(String []args){
        // > < , == , >= , && , ||
        // if-else (boolean wasCar = isCar ? true : false)

        /* Arithmetic Operator */
        /*
        + - * / %
        */

        /* Unary Operator */
        /*
        ++ --  !
        */

        /* Equlality & Relational Operator */
        /*
        == != > < <= >= 
        */

        /* Conditional Operator */
        /*
        && || ?:(Ternary)
        */

        /* Type Comparison Operator */
        /*
        instanceOf = Compare an object to a specified type
        */

        /* Bitwise and bit shift operator*/
        // << <<< >> >>>

        //1. Create a double variable with the value 20
        //2. Create a second variable of type double with the value 80
        //3. Add both numbers up and multiply by 25
        //4. Use the remainder operator to figure out the remainder from the sum of #3 divided by 40
        //5. Write an "if" statement that displays a message "Total was over the limit"
        // If the remaining total (#4) is equal to 20 or less
        double myFirstValue = 20d;
        double mySecondValue = 80;
        double myTotal = myFirstValue + mySecondValue * 25;
        double theRemainder = myTotal % 40;
        System.out.println("Remainder is: "+theRemainder);

        if(theRemainder <= 20)
            System.out.println("Total was over the limit");
    }
}