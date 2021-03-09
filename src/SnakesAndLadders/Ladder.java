/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SnakesAndLadders;

/**
 *
 *  mimic a ladder in Snakes & Ladders
 *  NO GRAPHICS INCLUDED
 * 
 *  Need to know where the "bottom" (start) of the ladder is, and also the "top" (end) 
 * 
 * @author Ken
 */
public class Ladder {
    
    private int top;
    private int bottom;
    
    /**
     *  Create a ladder given a start and end position
     * @param startPosition -- the start position given --will become the bottom
     * @param endPosition -- the end position -- will become the top
     * 
     */
    public Ladder(int startPosition, int endPosition) {
        
        this.top = endPosition;
        this.bottom = startPosition;
            
    }

    /**
     * 
     * @return the location of the top of the ladder
     */
    public int getTop() {
        
        return top;
        
    }

    /**
     * 
     * @return the location of the bottom of the ladder
     */
    public int getBottom() {
        
        return bottom;
        
    }
    
    
    
}
