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
public class GuessGameLevel1 {
    
    static int guess;
    Random rand = new Random();
    int numbertoguess=rand.nextInt(11);

    
    public int getNumbertoguess() {
        return numbertoguess;
    }
  
    public int getGuess() {
        return guess;
    }

     public static void setGuess(int sguess) {
        guess = sguess;  
  }
    
}
