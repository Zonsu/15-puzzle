package Algorithms;

import Game.Board;

/**
 * <code>Inversions</code> luokan avulla lasketaan inversioiden määrä
 * aloituslaudasta. Inversioksi lasketaan jokainen kahden numero­laatan pari,
 * jossa suurempi luku on ennen pienempää. Inversioiden määrästä voidaan
 * päätellä onko pelilauta ratkaistavissa.
 *
 * @author Johanna
 */
public class Inversions {

    /**
     * Lasketaan inversioiden määrä annetulle pelilaudalle.
     *
     * @param board annettu pelilauta
     * @return inversioiden määrä
     */
    public static int countInversions(Board board) {

        int tiles[] = board.getBoard();
        int count = 0;

        for (int i = 0; i < tiles.length; i++) {
            if (tiles[i] != 0) {
                count = count + inversionsForNumber(tiles[i], i, tiles);
            }
        }

        return count;
    }

    /**
     * Lasketaan inversioiden määrä annetulle numerolle
     *
     * @param number numero
     * @param index numeron indeksi
     * @param board taulukko pelilaudan numeroista
     * @return numeron inversioiden määrä
     */
    private static int inversionsForNumber(int number, int index, int[] board) {

        int count = 0;

        for (int i = index + 1; i < board.length; i++) {
            if (number > board[i] && board[i] != 0) {
                count++;
            }
        }
        return count;
    }
}
