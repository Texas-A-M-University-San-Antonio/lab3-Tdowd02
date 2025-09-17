/**
 Tyler Dowden
 9/16/2025
    Purpose Lab3: Calculate the compound interest when given original value, time, and rate of interest given.
 */



    import java.util.Scanner; // Imports the scanner from the library


    public class Lab3_Tyler_Dowden
    {
        public static void main(String[] args)
        {
                Scanner input = new Scanner(System.in); // Makes the scanner

                System.out.println("Original value of the house: "); 
                double value = input.nextDouble();

                System.out.println("Number of elapsed years: ");
                int years = input.nextInt();

                System.out.println("Rate of interest: ");
                double rate = input.nextDouble();

                rate = rate / 100;
                double finalValue = value * Math.pow(1 + (rate), years);

                System.out.println("The final value of your home after " + years + " years is: " + finalValue);


        }
    }

