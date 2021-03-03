/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boardgame;

import java.util.Random;

/**
 * This will mimic the action of a single Die
 * 
 * @author Ken
 */
public class Dice {
    
    private final int numSides;   //the number of sides on this dice
    
    /*
       create a dice given the no. of sides needed
    */
    public Dice(int numSides){
        
        this.numSides = numSides;
    }
    
    /**
     * 
     * @return a random int based on the number of sides on this dice
     */
    public int rollDice(){
        
        Random r = new Random();
        
        return ( r.nextInt(numSides) + 1);  //avoids rolling a 0
    }
    
   
    
}
