/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructures;

import Game.Board;
import java.util.Stack;

/**
 * Tilapäinen pino. Ei vielä käytössä.
 * 
 * @author Johanna
 */
public class TemporaryStack {

    private Stack<Board> stack;

    public TemporaryStack() {
        this.stack = new Stack();
    }

    public Board pop() {
        return stack.pop();
    }
    
    public void push(Board board) {
        stack.push(board);
    }
    
    public Board peek() {
        return stack.peek();
    }
}
