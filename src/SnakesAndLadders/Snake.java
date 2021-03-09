/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SnakesAndLadders;

import java.util.Random;

/**
 * This is a simple model of a snake in a game of Snakes and Ladders
 * 
 * No graphics are included!
 * 
 * Need a "head" (start) position and a "tail" (end) position
 * 
 * @author Ken
 */
public class Snake {
    
    private int head;
    private int tail;
    
        
    /**
     *  Create a snake with a given start and end position
     * 
     * @param head -- the start position given
     * @param tail  -- the end position given
     */
    public Snake(int head, int tail){
        
        this.head = head;
        this.tail = tail;
    }

    /**
     * 
     * @return the location of the head of the snake
     */
    public int getHead() {
        
        return head;
    }

    /**
     * 
     * @return the location of the tail of the snake
     */
    public int getTail() {
        
        return tail;
    }
    
    
}
