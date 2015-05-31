package Game;

import UI.Game;

/**
 * <code>Board</code> simuloi pelilautaa. 16 Ruutua joihin sijoitetaan numerot
 * 0-15 missä 0 on tyhjä ruutu.
 *
 * @author Johanna
 */
import Game.BoardFunctions.*;
import java.util.Arrays;

public class Board {

    /**
     * Pelilaudan numerot ovat <code>tiles</code> listassa. Ylärivi indeksit
     * 0-3, toinen 4-7, kolmas 8-11, alarivi 12-15. Listan ensimmäinen indeksi
     * vastaa pelilaudan vasenta ylänurkkaa ja viimeinen oikeaa alanurkkaa.
     */
    private int[] tiles;
    private final int numberOfTiles = 16;

    /**
     * Konstruktorissa luodaan uusi pelilauta sekä voittopelilauta.
     *
     * @param numbers lista numeroiden halutusta aloitusjärjestyksestä.
     */
    public Board(int[] numbers) {
        tiles = new int[numberOfTiles];
        for (int i = 0; i < numbers.length; i++) {
            tiles[i] = numbers[i];
        }
    }

    /**
     * Määritetään pelilaudan järjestys.
     *
     * @param numbers numerot halutussa järjestyksessä.
     */
    private void setBoard(int[] numbers) {
        this.tiles = numbers;
    }

    /**
     * Palauttaa pelilaudan tilanteen.
     *
     * @return pelilaudan numerot järjestyksessä.
     */
    public int[] getBoard() {
        return this.tiles;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    /**
     * Tarkastetaan ovatko kaksi lautaa samat.
     * 
     * @param obj verrattava lauta
     * @return true jos lauat ovat samat, muuten false
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Board board2 = (Board) obj;

        int[] tiles2 = board2.getBoard();
        for (int i = 0; i < tiles2.length; i++) {
            if (tiles[i] != tiles2[i]) {
                return false;
            }
        }
        return true;
    }

}
