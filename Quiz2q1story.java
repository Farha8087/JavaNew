import java.util.Scanner;

public class Quiz2q1story 
{
     public static void main(String[] args)
    {
        //create a Scanner object for the user input (opening the scanner)
        Scanner scanner = new Scanner (System.in);
        System.out.println("welcome to short story creation application");

        //prompt the user for thier name
        System.out.println("Enter your name: ");
        String name = scanner.nextLine(); //this is the code that takes the name

         //prompt the user for thier place they did some adventure
         System.out.println("Enter the place: ");
         String place = scanner.nextLine(); //this is the code that takes the age

         //prompt the your for their adventure
         System.out.println("Enter your adventure:  ");
         String activity = scanner.nextLine();

         //Display the result of the user on the screen
        System.out.println("Once upon a time, " + name +" went to the " + place + " and spent the whole day " + activity +".It was a fabulous day.");


        //close the scanner
        scanner.close();
    }

    
}
