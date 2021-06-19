/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication01;

import java.util.*;

/**
 *
 * @author amral
 */
public class JavaApplication01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

    Scanner scan = new Scanner(System.in);
    System.out.println("Level 1 you have 5 trys to guess a static number which will be genarted randomaly the first time only");
    System.out.println("Level 2 you have 5 trys to guess a variable number which will be changing randomaly every time you try");
    System.out.println("Level 3 It's a free level where the user will decied the range of number to guess from "); 
    System.out.println("Please enter Which level you want to try today");
    int Level = scan.nextInt();

    
    if(Level == 1)
    { 
    GuessGame.GuessGameLevel1();
    }
    if(Level == 2)
    { 
    GuessGame.GuessGameLevel2();

    } 
    if(Level == 3)
    { 
    GuessGame.GuessGameLevel3();
    }
}
}

