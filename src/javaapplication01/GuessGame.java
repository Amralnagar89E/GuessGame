/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication01;
import java.util.Scanner;

/**
 *
 * @author amral
 */
public class GuessGame {

   public static void GuessGameLevel1()
   {
       Scanner scan = new Scanner(System.in);
       GuessGameLevel1  guess1 = new GuessGameLevel1();
       double s=10;
       double prob;
       
     System.out.println("Please enter your guess for a number between 0 and 10 ");

    for(int i=0;i<5;i++)
    {
                //Scanning the number from the user
        prob=1/(s-i)*100;
        System.out.println("The probability of guessing the number is "+prob+" %");
        System.out.print("Your Number is :");

        guess1.setGuess(scan.nextInt());
        
     //Checking if the the user got it right

        if(guess1.getGuess()== guess1.getNumbertoguess())
        {
                        //if true the programm will break

        System.out.println("Bingo You Got it from your "+(i+1)+" Time");
        break;
        }     //if false the program will check the number of trys

         else
        {
        if(i!=4) //if the user still has tries the program will print him a messege with the remaning trys and loop agin till he gets it right or run out of trys

        {
        System.out.println("Sorry You didn't Get it please try again you have "+(5-(i+1))+" times left ");
        }
        }
        }    //after the loop is finshed the program will check if he got the right guess or not

    if(guess1.getGuess()!= guess1.getNumbertoguess())
        {
        System.out.println("Sorry You didn't Get it "+"The guess was "+guess1.getNumbertoguess());
        }
  
   }
   public static void GuessGameLevel2()
   {
       Scanner scan = new Scanner(System.in);
       GuessGameLevel2  guess2 = new GuessGameLevel2();
       double prob=10;
       
     System.out.println("Please enter your guess for a number between 0 and 10 ");

    for(int i=0;i<5;i++)
    {
        System.out.println("The probability of guessing the number is "+prob+" %");
        System.out.print("Your Number is :");

        //Scanning the number from the user and setting a number to be guessed every try
        guess2.setGuess(scan.nextInt());
        guess2.setNumbertoguess();
        
        //Checking if the the user got it right
        if(guess2.getGuess()== guess2.getNumbertoguess())
        {
            //if true the programm will break
        System.out.println("Bingo You Got it from your "+(i+1)+" Time");
        break;
        }
                    //if false the program will check the number of trys
         else
        {
                  //if the user still has tries the program will print him a messege with the remaning trys and loop agin till he gets it right or run out of trys

        if(i!=4)
        {
        System.out.println("Sorry You didn't Get it please try again you have "+(5-(i+1))+" times left ");
        }
    }
    }
    //after the loop is finshed the program will check if he got the right guess or not
    if(guess2.getGuess()!= guess2.getNumbertoguess())
        {
        System.out.println("Sorry You didn't Get it "+"The guess was "+guess2.getNumbertoguess());
        }
    
   }
   public static void GuessGameLevel3()
   {
     Scanner scan = new Scanner(System.in);
     GuessGameLevel3  guess3 = new GuessGameLevel3();
       
  
     System.out.println("Please enter what range you want to play form 0 to .... ");
     guess3.setRange(scan.nextInt());
     System.out.println("Please enter your guess for a number between 0 and "+guess3.getRange());
     double s=guess3.getRange();
     double prob;

    for(int i=0;i<5;i++)
    {
        prob=1/(s-i)*100;
        System.out.println("The probability of guessing the number is "+prob+" %");
        System.out.print("Your Number is :");

        //Scanning the number from the user 
        guess3.setGuess(scan.nextInt());

        //Checking if the the user got it right
        if(guess3.getGuess()== guess3.getNumbertoguess())
        {
            //if true the programm will break
        System.out.println("Bingo You Got it from your "+(i+1)+" Time");
        break;
        }
                    //if false the program will check the number of trys
         else
        {
                  //if the user still has tries the program will print him a messege with the remaning trys and loop agin till he gets it right or run out of trys

        if(i!=4)
        {
        System.out.println("Sorry You didn't Get it please try again you have "+(5-(i+1))+" times left ");
        }
        }
        }
    //after the loop is finshed the program will check if he got the right guess or not
    if(guess3.getGuess()!= guess3.getNumbertoguess())
        {
        System.out.println("Sorry You didn't Get it "+"The guess was "+guess3.getNumbertoguess());
    }
  }
}
