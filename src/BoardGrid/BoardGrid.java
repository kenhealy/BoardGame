/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BoardGrid;

import SnakesAndLadders.*;

/**
 * Mimic a grid of squares like a "board"
 * 
 *  an EMPTY square = -1
 *  a snake head = 5 ; a snake tail = 6
 *  the bottom of a ladder = 0; the top = 1
 * 
 * @author Ken
 * 
 */

public class BoardGrid {
    
    private int grid[][]; //this is the grid as it will be stored in memory
    
    /**
     *  Create a SQUARE grid
     * @param size -- the "side length" of the grid
     */
    public BoardGrid(int size){
        
        this.grid = new int[size][size];  // this creates the array
        setUpBoard();
    }
    
    /**
     * Creates a RECTANGULAR grid
     * @param height - the number of rows in the grid
     * @param width - the number of columns in the grid
     */
    public BoardGrid(int height, int width){
        
        this.grid = new int[height][width];
        setUpBoard();
        
    }
    
    public void setSnakes(Snake[] snakes){
        
        for (Snake s: snakes){   
            
            int snakeHead = s.getHead();
            
            //CHEAT HERE //
            //I know that for THIS GAME it is a 10x10 square grid !!
            
            int colNumber = snakeHead % 10;  //remained after division by 10
            int rowNumber = snakeHead / 10;  // integer division!
            
            /** EXAMPLE
             * 
             *  snakehead = 24
             * 
             *  24 % 10 = 4 --> column is 4
             *  24 / 10 = 2 --> row is 4
             */
            
            this.grid[rowNumber][colNumber] = 5;
            
            colNumber = s.getTail() % 10;  //remained after division by 10
            rowNumber = s.getTail() / 10;  // integer division!
            
            this.grid[rowNumber][colNumber] = 6;
            
        }
        
    }
    
    /**
     * Places ladders on the grid
     * (Does not print to console)
     * @param ladders an array of Ladders to be put into the grid
     */
    public void setLadders(Ladder[] ladders){
        
        for(Ladder L: ladders){  
            
           int ladderBottom = L.getBottom();
           
           int rowNumber = ladderBottom / 10; //INTEGER DIVISION !!
           
           int colNumber = ladderBottom % 10; //remainder after division by 10
           
           /****
            * EXAMPLE
            * 
            * Ladder bottom is in square 29
            * 29 / 10 = 2
            * 29 % 10 = 9
            */
           this.grid[rowNumber][colNumber] = 0;
           
           rowNumber = L.getTop() / 10; //INTEGER DIVISION !!
           
           colNumber = L.getTop() % 10; //remainder after division by 10
           
           this.grid[rowNumber][colNumber] = 1;
           
           
        }
        
    }
    
    /**
     *  Initialise board values so that squares are empty
     */
    private void setUpBoard(){
       
        for (int i = 0; i< this.grid.length; i++) {
            //rows
            for (int j = 0; j < this.grid[i].length; j++) {
                //columns
                this.grid[i][j] = -1;
            }
        }
    }
    /**
     *  Draw the board on the console
     *  NOTE -- this is not very portable code!
     */
    public void drawBoard(){
        
        //outer loop to process each row one at a time
        for (int row = 0; row < this.grid.length; row++){
            
            System.out.print("\n|");
            
            //inner loop that processes each "box" in the row (i.e. goes across all the columns
            for (int column = 0; column < this.grid[row].length; column++){
                
                //check what is in this "box"
                //the first time this is run, it will be -1 in all spaces
                //as game progresses, this will change
                if (grid[row][column] == -1) {
                    //empty slot 
                    System.out.print("_|");
                    
                } else if (grid[row][column] == 5) {
                    
                    System.out.print("s|");
                }
                 else if (grid[row][column] == 6){
                            
                     System.out.print("t|");
                            
                 } else if (grid[row][column] == 0){
                 
                     System.out.print("b|");
                    
                 }else {
                     // must be the top of a ladder
                     System.out.print("h|");
                 }
                
                //what abou the players??? THIS IS NOT FINISHED YET!!!!!!
                

                }

            }
            
        }
        
    
}
