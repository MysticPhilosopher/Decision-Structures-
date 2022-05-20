//Importing java scanner class.
import java.util.Scanner; 

public class RomanNumerals
{
    public static void main(String[]args)
    {
        /*
        Allow the user to input a number.
        Has to be in range 1-10 assume a loop isn't allowed and you're only assuming a user follows
        directions
        Use a if statement to filer in the options. 
        Print result if true. */

        int number; 
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number in the range 1-10 to receive a roman numeral: ");
        number = keyboard.nextInt();


        if(number==10)
        {
            System.out.println("X");
        }
        if(number==9)
        {
            System.out.println("IX");
        }
        if(number==8)
        {
            System.out.println("VIII");

        }
        if(number==7)
        {
            System.out.println("VII");

        }
        
        if(number==6)
        {
            System.out.println("VI");

        }
        
        if(number==5)
        {
            System.out.println("V");

        }
        
        if(number==4)
        {
            System.out.println("IV");

        }
        
        if(number==3)
        {
            System.out.println("III");
        }
        
        if(number==2)
        {
            System.out.println("II");
        }
        if(number==1)
        {
            System.out.println("I");
        }

        /*Error message. The else if assumes that all of the other conditions are false
         and prints an error message.*/ 
        else if(number<0 || number>10)
        {
            System.out.println("Please enter a valid number in the range 1-10");
            number = keyboard.nextInt();
        }
        

        
    }
}