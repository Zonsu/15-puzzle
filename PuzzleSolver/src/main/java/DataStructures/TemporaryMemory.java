/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructures;

import Game.Board;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Tilapäinen muisti syvyyshakua varten.
 * 
 * @author Johanna
 */
public class TemporaryMemory {

//    private HashSet<Board> set;
    private ArrayList<Board> list;

    public TemporaryMemory() {
//        set = new HashSet();
        list = new ArrayList();
    }
    
    public void addToMemory(Board board) {
//        set.add(board);
        list.add(board);
    }
    
    public boolean memoryContains(Board board) {
        return list.contains(board);
    }

}
