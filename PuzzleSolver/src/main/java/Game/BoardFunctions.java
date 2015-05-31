package Game;

/**
 * <code>BoardFunctions</code> tarjoaa kaikki pelilaudan numeroiden siirtämiseen
 * tarvittavat funktiot. Se tarkistaa myös siirtojen laillisuuden. Funktiot ovat
 * staattisia.
 *
 * @author Johanna
 */
public class BoardFunctions {

    /**
     * Palauttaa ruudussa olevan numeron.
     *
     * @param index ruudun indeksi
     * @param board pelilauta
     * @return ruudussa sijaitseva numero
     */
    public static int getTile(int index, Board board) {

        if (index >= 0 && index <= 16) {
            return board.getBoard()[index];
        } else {
            return -1;
        }
    }

    /**
     * Palauttaa numeron sijainnin laudalla.
     *
     * @param num haettava numero
     * @param board pelilauta
     * @return ruudun indeksi
     */
    public static int getNumberIndex(int num, Board board) {

        int[] tiles = board.getBoard();

        for (int i = 0; i < tiles.length; i++) {
            if (tiles[i] == num) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Numeron siirto toiseen ruutuun. Haetaan ensin siirrettävän numeron
     * <code>tileNum</code> indeksi ja tämän jälkeen tyhjän ruudun (0) indeksi.
     * Kutsutaan metodia joka yrittää vaihtaa numeroiden indeksejä eli paikkoja.
     *
     * @param tileNum siirrettävä numero.
     * @param board lauta johon siirto tehdään
     * @return uusi lauta johon siirto tehty
     */
    public static Board moveTile(int tileNum, Board board) {
        return switchTiles(getNumberIndex(tileNum, board), getNumberIndex(0, board), board);
    }

    /**
     * Jos siirto on sallittu vaihdetaan haluttu numero ja tyhjä ruutu päittäin.
     *
     * @param tileIndex siirrettävän numeron ruutu
     * @param emptyIndex tyhjä ruutu
     * @return palautetaan uusi lauta
     */
    private static Board switchTiles(int tileIndex, int emptyIndex, Board board) {
        int[] tiles = board.getBoard();

        if (switchCheck(tileIndex, emptyIndex)) {
            tiles[emptyIndex] = tiles[tileIndex];
            tiles[tileIndex] = 0;
            System.out.println("Siirto onnistui!");

        } else {
            System.out.println("Ei voida siirt\u00e4\u00e4!");

        }
        return new Board(tiles);

    }

    /**
     * Tarkistetaan onko siirto sallittu. Luku voidaan siirtää vain tyhjään
     * ruutuun joka on sen välittömässä läheisyydessä, ei esimerkiksi
     * vastakkaiselle puolelle lautaa. <code>remainder</code> on ruutujen
     * indeksien erotus ja kertoo halutun liikkumissuunnan ja onko numeron
     * viereinen ruutu tyhjä vai ei.
     *
     * @param tileIndex siirrettävän numeron ruutu
     * @param emptyIndex tyhjä ruutu
     * @return true jos siirto on sallittu, muuten false
     */
    private static boolean switchCheck(int tileIndex, int emptyIndex) {
        int remainder = tileIndex - emptyIndex;
        if (remainder == 1 && tileIndex % 4 != 0) {
            return true;
        } /*
         Remainder -1, tyhjä ruutu löytyy oikealta puolelta. Varmistetaan, ettei siirrettävä numero ole oikeassa reunassa.
         */ else if (remainder == -1 && tileIndex % 4 != 3) {
            return true;
        } /*
         Remainder 4, tyhjä ruutu löytyy yläpuolelta. Varmistetaan, ettei siirrettävä numero ole ylärivillä.
         */ else if (remainder == 4 && tileIndex >= 4) {
            return true;
        } /*
         Remainder -4, tyhjä ruutu löytyy alapuolelta. Varmistetaan, ettei siirrettävä numero ole alarivillä.
         */ else if (remainder == -4 && tileIndex <= 11) {
            return true;
        }
        /*
         Tyhjä ruutu ei ole siirrettävän numeron vieressä, numeroa ei voida siirtää.
         */
        return false;
    }

    /**
     * Tarkastaa onko peli ratkennut.
     *
     * @param board pelilauta
     * @return true jos <code>tiles</code> vastaa voittolautaa
     * <code>goal</code>, muuten false.
     */
    public static boolean checkVictory(Board board) {
        int[] tiles = board.getBoard();

        for (int i = 0; i < 15; i++) {
            if (tiles[i] != i + 1) {
                return false;
            }
        }
        return true;
    }

    //    public void moveDirection(int tileIndex, int emptyIndex) {
    //        int remainder = tileIndex - emptyIndex;
    //
    //        if (remainder == 1 && tileIndex % 4 != 0) {
    //            move(tileIndex, emptyIndex);
    //
    //        } else if (remainder == -1 && tileIndex % 4 != 3) {
    //            move(tileIndex, emptyIndex);
    //
    //        } else if (remainder == 4 && tileIndex >= 4) {
    //            move(tileIndex, emptyIndex);
    //
    //        } else if (remainder == -4 && tileIndex <= 11) {
    //            move(tileIndex, emptyIndex);
    //        } else {
    //            System.out.println("Ei voi siirtää!");
    //        }
    //    }
    //    public void moveUp(int index) {
    //        if (index >= 4 && tiles[index - 4] == 0) {
    //            tiles[index - 4] = tiles[index];
    //            tiles[index] = 0;
    //        }
    //    }
    //
    //    public void moveDown(int index) {
    //        if (index <= 11 && tiles[index + 4] == 0) {
    //            tiles[index + 4] = tiles[index];
    //            tiles[index] = 0;
    //        }
    //    }
    //
    //    public void moveLeft(int index) {
    //        if (index % 4 != 0 && tiles[index - 1] == 0) {
    //            tiles[index - 1] = tiles[index];
    //            tiles[index] = 0;
    //        }
    //    }
    //
    //    public void moveRight(int index) {
    //        if (index % 4 != 3 && tiles[index + 1] == 0) {
    //            tiles[index + 1] = tiles[index];
    //            tiles[index] = 0;
    //        }
    //    }
}
