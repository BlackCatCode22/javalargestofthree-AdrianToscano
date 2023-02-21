import java.util.Scanner;

/* LargestOfThree.java
 *
 * AAT 2/20/23
 * CIT-63 Java programming class
 * References:
 *   https://www.w3schools.com/java/java_user_input.asp
 *   https://www.w3schools.com/java/java_conditions.asp
 *   https://www.w3schools.com/java/java_variables.asp
 *
 * input: three ints from user
 * processing: find the largest of the three ints with decision structures
 * output: the largest of three ints, the sum of three ints
 */
public class AdrianLargestOfThree {
    public static void main(String[] args) {
        // variables
        Scanner sc = new Scanner(System.in);
        int userNum = 0, sum = 0, largest = 0;
        final int NUMBER_OF_INTS = 3;

        // prompt user for 3 numbers
        System.out.println("Hello, please enter 3 numbers: ");

        // loop 3 times
        for (int i = 0; i < NUMBER_OF_INTS; i++) {

            // accept a number from the user
            System.out.println("Number " + (i + 1) + ": ");
            userNum = sc.nextInt();

            // assign the larger number to the variable "largest"
            if (userNum > largest) {
                largest = userNum;
            }

            // add the users number to the sum
            sum += userNum;
        }

        // output the largest and the sum
        System.out.println("....\nThe largest number you entered is: " + largest);
        System.out.println("The sum of all the numbers is : " + sum);
    }
}
