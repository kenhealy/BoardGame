/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boardgame;

import BoardGrid.BoardGrid;

/**
 * A simple Snakes and Ladders game
 * 
 * Minimum 2 players -- Max ??
 * 
 * Standard board is 10 x 10 = 100 squares
 * 
 * SIX snakes and SIX ladders
 *  //OPTION -- randomly position the snakes and ladders each time you play!
 * 
 * "store" the current location of each player on the board
 *  No snake or ladder on the LAST square or the FIRST square
 * 
 * REMINDER - The BOTTOM of a ladder MUST be BELOW the TOP
 * ALSO the HEAD of a snake must be ABOVE the TAIL
 * 
 * You cannot have a ladder AND a snake on the same square
 * 
 * @author Ken
 */
public class BoardGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Dice myDice = new Dice(6);  //create a 6-sided dice to play this game
        
        BoardGrid SLGame = new BoardGrid(10);
        
        /// ********* TESTING ************* //
        SLGame.drawBoard();
        //////////////////////////////////////        
    }
    
}
