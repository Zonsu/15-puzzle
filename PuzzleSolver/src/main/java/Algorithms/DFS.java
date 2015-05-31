/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms;

import DataStructures.TemporaryMemory;
import DataStructures.TemporaryStack;
import Game.Board;
import static Game.BoardFunctions.*;
import static Game.TileMoves.*;

/**
 *
 * @author Johanna
 */
public class DFS {

    private Board board;
    private TemporaryMemory memory;

    public DFS(Board board) {
        this.board = board;
        memory = new TemporaryMemory();
    }

    public boolean DFSearch(Board board) {

        if (checkVictory(board)) {
            return false;
        }
        
        if (!memory.memoryContains(board)) {

            for (int i = 0; i < 16; i++) {

                memory.addToMemory(board);

                if (getMoveUp(getNumberIndex(i, board), board)) {
                    if (!DFSearch(moveUp(i, board))) {
                        return false;
                    }
                } else if (getMoveLeft(getNumberIndex(i, board), board)) {
                    if (!DFSearch(moveLeft(i, board))) {
                        return false;
                    }

                } else if (getMoveRight(getNumberIndex(i, board), board)) {
                    if (!DFSearch(moveRight(i, board))) {
                        return false;
                    }

                } else if (getMoveDown(getNumberIndex(i, board), board)) {
                    if (!DFSearch(moveDown(i, board))) {
                        return false;
                    }
                }
            }

        }
        return true;
    }
}
