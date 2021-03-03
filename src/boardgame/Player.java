/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boardgame;

/**
 * A simple Player for a game
 * 
 * @author Ken
 */
public class Player {
    
   private String name;
   private int boardPosition;
   
   private int turnCounter;  
   
   private double gameScore;
   
   
   public Player(String name){
       
       this.name = name;
       this.boardPosition = 0;
       this.turnCounter = 0;
   }
   
   /**
    *  The Player takes a turn by rolling the dice s/he is given and returning the number rolled
    * 
    * @param theDice - the Dice given to the Player
    * @return the score on the dice after rolling it
    * 
    */
   public int takeTurn(Dice theDice){
       
       this.turnCounter++;
       
       return(theDice.rollDice());
       
   }
   
   /**
    * 
    * @return the Player's name
    */
   public String getName(){
       
       return(this.name);
   }
   
   
}
