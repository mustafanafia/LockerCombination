/**
 * Name: Mustafa Nafia
 * Instructor: Cindy Tucker
 * Class: CIT 149
 * Purpose: Encryption cipher
 */
import java.util.Scanner;
import java.util.Random;

public class lockercombination {
    public static void main (String [] args) {
        Scanner scnr = new Scanner (System.in);
        Random randGen = new Random();
 
        String studentName; 
        String lockerNumber; 
        final int securityKey;
        int firstCombinationNumber;
        int secondCombinationNumber; 
        int thirdCombinationNumber; 
        final int COMBINATION_MAX = 40;

        int numMonthsRent;
        int studentPaid;
        final int monthlyRate = 11;
        int encryptedCombination1;
        int encryptedCombination2;
        int encryptedCombination3;
     
        int encryptedwithModuloWrapAround;
        int encryptedwithModuloWrapAround1;
        int encryptedwithModuloWrapAround2;
        int studentChange;
        
        securityKey = randGen.nextInt(500) + 1;
        
   
        System.out.println("please enter your full name");
        studentName = scnr.nextLine();
        
       
        System.out.println("Choose a locker number");
        lockerNumber = scnr.next();
       
   
        System.out.println("Enter first combination number");
        firstCombinationNumber = scnr.nextInt(); 
        
        System.out.println("Enter second combination number");
        secondCombinationNumber = scnr.nextInt(); 
        
        System.out.println("Enter third combination number");
        thirdCombinationNumber = scnr.nextInt(); 
        
        System.out.println("How many months are you renting the locker?");
        numMonthsRent = scnr.nextInt();
        
        System.out.println("How much are you paying? ");
        studentPaid = scnr.nextInt();
        
        
        encryptedCombination1 = (firstCombinationNumber + securityKey);      
        System.out.println(encryptedCombination1);                             //delete this System.out line
        
        encryptedCombination2 = (secondCombinationNumber + securityKey);
        System.out.println(encryptedCombination2);                              //delete this System.out line
        
        encryptedCombination3 = (thirdCombinationNumber + securityKey);
        
        System.out.println(encryptedCombination3);                              //delete this System.out line
        
        
        encryptedwithModuloWrapAround = (encryptedCombination1 % COMBINATION_MAX);
        encryptedwithModuloWrapAround1 = (encryptedCombination2 % COMBINATION_MAX);
        encryptedwithModuloWrapAround2 = (encryptedCombination3 % COMBINATION_MAX);
        
        
        System.out.println("Student name is " + studentName);
        System.out.println("Locker number assigned is " + lockerNumber);
        System.out.println("Encrypted Combination " + encryptedwithModuloWrapAround + " " + encryptedwithModuloWrapAround1 + " " 
        + encryptedwithModuloWrapAround2);
        
        System.out.println("Amount of money used " + studentPaid);
        System.out.println("Months rented " + numMonthsRent);
               
        studentChange = (studentPaid - (numMonthsRent * monthlyRate));
        System.out.println("Change given to student: " + studentChange);
    }
}

    
        
    

        
        
        
        
        
   

        
 

       
        