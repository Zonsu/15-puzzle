/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

/**
 * Luokka kovasti kesken ja vaatii siistimistä ja abstraktia luokkaa. Tehty
 * rekursiota ajatellen.
 *
 * @author Johanna
 */
public class TileMoves {

    public static Boolean getMoveUp(int index, Board board) {
        int[] tiles = board.getBoard();

        if (index >= 4 && tiles[index - 4] == 0) {
            return true;
        }
        return false;
    }

    public static Boolean getMoveDown(int index, Board board) {
        int[] tiles = board.getBoard();
        if (index <= 11 && tiles[index + 4] == 0) {
            return true;
        }
        return false;
    }

    public static Boolean getMoveLeft(int index, Board board) {
        int[] tiles = board.getBoard();
        if (index % 4 != 0 && tiles[index - 1] == 0) {
            return true;
        }
        return false;
    }

    public static Boolean getMoveRight(int index, Board board) {
        int[] tiles = board.getBoard();
        if (index % 4 != 3 && tiles[index + 1] == 0) {
            return true;
        }
        return false;
    }

    public static Board moveUp(int index, Board board) {
        int[] tiles = board.getBoard();
        tiles[index - 4] = tiles[index];
        tiles[index] = 0;

        return new Board(tiles);
    }

    public static Board moveDown(int index, Board board) {
        int[] tiles = board.getBoard();
        tiles[index + 4] = tiles[index];
        tiles[index] = 0;

        return new Board(tiles);
    }

    public static Board moveLeft(int index, Board board) {
        int[] tiles = board.getBoard();
        tiles[index - 1] = tiles[index];
        tiles[index] = 0;

        return new Board(tiles);
    }

    public static Board moveRight(int index, Board board) {
        int[] tiles = board.getBoard();
        tiles[index + 1] = tiles[index];
        tiles[index] = 0;

        return new Board(tiles);
    }
}
