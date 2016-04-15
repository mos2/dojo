/**
 * Homework_One.java
 * Description: IBM Cork CoderDojo Advanced Programming Homework 1 Solution
 * @author Michael O'Sullivan MichaelOSullivan@ie.ibm.com
 * @date 15th April 2016
 */
public class Homework_One
{
    public static void main (String[] args)
    {
        //Get the chosen number provided by the user, passed
        //as the first (and only) command line argument.
        //Need to convert to an int, as it is a String.
        int chosenNumber = Integer.parseInt(args[0]);

        //Outer loop for printing each of chosenNumber lines.
        //Let index record which line we are on, and increase
        //as we go up to chosenNumber.
        for (int index = 1; index <= chosenNumber; index++)
        {
            //Start a new empty line.
            System.out.println();
            //Inner loop for printing each number from 1 up to index on the line.
            for (int counter = 1; counter <= index; counter++)
            {
                System.out.print(counter + " ");
            }
        }

        //Outer loop for printing each of chosenNumber lines.
        //Let index record which line we are on, and decrease
        //as we go down from chosenNumber to 1.
        for (int index = chosenNumber; index > 0; index--)
        {
            System.out.println();
            for (int counter = index; counter >= 1; counter--)
            {
                //Inner loop for printing each number from index down to 1 on the line.
                System.out.print(counter + " ");
            }
        }
    }
}