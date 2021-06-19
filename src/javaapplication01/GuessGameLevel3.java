/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication01;

import java.util.Random;

/**
 *
 * @author amral
 */
public class GuessGameLevel3 {
    static int guess;
    private int range;
    Random rand = new Random();
    
    int numbertoguess;
    
    
    public int getRange() {
        return range;
    }

    public void setRange(int srange) {
       range = srange;
       numbertoguess=rand.nextInt(range+1);
    }
    
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
