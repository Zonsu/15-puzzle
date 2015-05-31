/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructures;

import Game.Board;
import java.util.HashSet;

/**
 *
 * @author Johanna
 */
public class TemporaryMemory {

    private HashSet<Board> set;

    public TemporaryMemory() {
        set = new HashSet();
    }
    
    public void addToMemory(Board board) {
        set.add(board);
    }
    
    public boolean memoryContains(Board board) {
        return set.contains(board);
    }

}
