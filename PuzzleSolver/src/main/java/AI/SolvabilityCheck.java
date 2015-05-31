
package AI;

import Game.Board;
import static Game.BoardFunctions.*;
import static Algorithms.Inversions.*;

/**
 * <code>SolvabilityCheck</code> tarjoaa metodit joilla voidaan tarkistaa onko
 * pelilauta ratkaistavissa.
 *
 * @author Johanna
 */
public class SolvabilityCheck {

    /**
     * Kertoo onko lauta ratkaistavissa vai ei.
     *
     * @param board
     * @return true jos on ratkaistavissa, muuten false
     */
    public static boolean getSolvability(Board board) {
        if (!inversionsCheck(board)) {
            return false;
        }
        return true;
    }

    /**
     * Pelilauta ei ole ratkaistavissa jos tyhjä ruutu on alarivillä ja
     * inversioiden määrä on pariton. Käyetään hyväksi <code>Inversions</code>
     * luokan inversionit laskevaa algoritmia sekä <code>BoardFunctions</code>
     * luokan metodia joka palauttaa numeron indeksin pelilaudalla.
     *
     * @param board pelilauta
     * @return true jos ratkaistavissa, muuten false
     */
    public static boolean inversionsCheck(Board board) {

        if (countInversions(board) % 2 != 0 && getNumberIndex(0, board) >= 12) {
            return false;
        }
        return true;

    }
}
