/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package player;

import boardgame.Dice;



/**
 * A simple Player for a game
 * 
 * @author Ken
 */
public class Player {
   
   // PROPERTIES// 
   private String name;
   private int boardPosition;
   
   private int turnCounter;  
   
   private double gameScore;
   
   //CONSTRUCTORS//
   public Player(String name){
       
       this.name = name;
       this.boardPosition = 0;
       this.turnCounter = 0;
       this.gameScore = 0;      //assumes you always start with a score of 0
   }
   
   public Player(String name, double startingScore){
       
       this.name = name;
       this.boardPosition = 0;
       this.turnCounter = 0;
       this.gameScore = startingScore;
       
   }
   
   //METHODS//
   
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
