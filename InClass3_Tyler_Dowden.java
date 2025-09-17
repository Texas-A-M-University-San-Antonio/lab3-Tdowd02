/**
 * Name: Tyler Dowden
 * Date: 9/16/2025
* Purpose: InClass 3 - 
* Prompts the user to input the side of a cube, the code then reads the input and calculates and prints the volume and surface area
    of the cube based on the side length given.
 */

        import java.util.Scanner; //Imports the scanner from library

// Don't forget to import and declare a Scanner for user input.

public class InClass3_Tyler_Dowden
{
    public static void main(String[] args) 
    {       
            Scanner input = new Scanner(System.in); // Make scanner

        // In-Class 3 Example:
        // Step 1: Prompt the user to enter the length of the side of a cube.

            System.out.println("Length of sides: "); // Prompts user to input length of the cube sides

        // Step 2: Read the user's input and store it in a variable.

            double length = input.nextDouble(); // Stores user input in length

        // Step 3: Use an appropriate method to determine the volume of the cube.

            double volume = Math.pow(length, 3); // Calculates the volume
            
        // Step 4: Use an appropriate method to determine the surface area of the cube.

            double SA = Math.pow(length, 2); // Calculates the surface area
            SA = 6*SA;

        // HINT: Steps 3 and 4 will use the Math.pow(a, b) method
        // Step 5: Print the volume and surface area in clear sentences.

        System.out.println("The volume of the cube is "+ volume); // prints the volume
        System.out.println("The surface area of the cube is "+ SA); // prints the surface area

    }
}