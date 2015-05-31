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
import static UI.UIFunctions.*;

/**
 * Tavallinen syvyyshaku. Koitetaan siirtää numeroita jokaisesta indeksistä. Aiheuttaa stackoverflown.
 * 
 * @author Johanna
 */
public class DFS {

    private Board board;
    private TemporaryMemory memory;
    private int count;

    public DFS(Board board) {
        this.board = board;
        this.count = 0;
        memory = new TemporaryMemory();
    }

    /**
     * Syvyyshakua testattu, ei toimi.
     * @param board pelilauta
     * @return false jos rekursio päättyy, muuten true
     */
    public boolean DFSearch(Board board) {

        if (checkVictory(board)) {
            return false;
        }
        count++;

        if (!memory.memoryContains(board)) {
            memory.addToMemory(board);

            for (int i = 0; i < 16; i++) {

                if (getMoveUp(i, board)) {

                    printBoard(board);

                    if (!DFSearch(moveUp(i, board))) {
                        return false;
                    }
                } else if (getMoveLeft(i, board)) {

                    printBoard(board);

                    if (!DFSearch(moveLeft(i, board))) {
                        return false;
                    }

                } else if (getMoveRight(i, board)) {

                    printBoard(board);

                    if (!DFSearch(moveRight(i, board))) {
                        return false;
                    }

                } else if (getMoveDown(i, board)) {

                    printBoard(board);

                    if (!DFSearch(moveDown(i, board))) {
                        return false;
                    }
                }
            }

        }
        return true;
    }

    public int printCount() {
        return this.count;
    }
}
