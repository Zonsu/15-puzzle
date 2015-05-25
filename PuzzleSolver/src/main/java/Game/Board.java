package Game;

import UI.Game;

/**
 * <code>Board</code> simuloi pelilautaa ja siirtoja. 16 Ruutua joihin
 * sijoitetaan numerot 0-15 missä 0 on tyhjä ruutu.
 *
 * @author Johanna
 */
public class Board {

    /**
     * Pelilaudan numerot ovat <code>tiles</code> listassa. Ylärivi indeksit
     * 0-3, toinen 4-7, kolmas 8-11, alarivi 12-15. Listan ensimmäinen indeksi
     * vastaa pelilaudan vasenta ylänurkkaa ja viimeinen oikeaa alanurkkaa.
     */
    private int[] tiles;
    /**
     * Pelilaudan ruutujen määrä.
     */
    private int[] goal;
    private final int numberOfTiles = 16;

    /**
     * Konstruktorissa luodaan uusi pelilauta sekä voittopelilauta.
     *
     * @param numbers lista numeroiden halutusta aloitusjärjestyksestä.
     */
    public Board(int[] numbers) {
        tiles = new int[numberOfTiles];
        setBoard(numbers);
        setGoal();
    }

    /**
     * Määritetään pelilaudan järjestys.
     *
     * @param numbers numerot halutussa järjestyksessä.
     */
    private void setBoard(int[] numbers) {
        tiles = numbers;
    }

    /**
     * Palauttaa pelilaudan tilanteen.
     *
     * @return pelilaudan numerot järjestyksessä.
     */
    public int[] getBoard() {
        return tiles;
    }

    /**
     * Palauttaa ruudussa olevan numeron.
     *
     * @param index ruudun indeksi
     * @return ruudussa sijaitseva numero
     */
    public int getTile(int index) {
        if (index >= 0 && index <= 16) {
            return tiles[index];
        } else {
            return -1;
        }
    }

    /**
     * Palauttaa numeron sijainnin laudalla.
     *
     * @param num haettava numero
     * @return ruudun indeksi
     */
    public int getNumberIndex(int num) {
        for (int i = 0; i < tiles.length; i++) {
            if (tiles[i] == num) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Numeron siirto toiseen ruutuun. Haetaan ensin siirrettävän numeron
     * <code>tileNum</code> indeksi  ja tämän jälkeen tyhjän
     * ruudun (0) indeksi. Kutsutaan metodia joka yrittää vaihtaa
     * numeroiden indeksejä eli paikkoja.
     *
     * @param tileNum siirrettävä numero.
     */
    public void moveTile(int tileNum) {
        switchTiles(getNumberIndex(tileNum), getNumberIndex(0));
    }

    /**
     * Jos siirto on sallittu vaihdetaan haluttu numero ja tyhjä ruutu päittäin.
     *
     * @param tileIndex siirrettävän numeron ruutu
     * @param emptyIndex tyhjä ruutu
     */
    private void switchTiles(int tileIndex, int emptyIndex) {

        if (switchCheck(tileIndex, emptyIndex)) {
            tiles[emptyIndex] = tiles[tileIndex];
            tiles[tileIndex] = 0;
            System.out.println("Siirto onnistui!");

        } else {
            System.out.println("Ei voida siirtää!");
        }

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
    private boolean switchCheck(int tileIndex, int emptyIndex) {

        int remainder = tileIndex - emptyIndex;

        /*
         Remainder 1, tyhjä ruutu löytyy vasemmalta puolelta. Varmistetaan, ettei siirrettävä numero ole vasemmassa reunassa.
         */
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
     * Metodi alustaa voittopelilaudan. Numerot tulee olla järjestyksessä 1-15,
     * viimeisenä 0.
     */
    private void setGoal() {
        goal = new int[16];
        for (int i = 0; i < 15; i++) {
            goal[i] = i + 1;
        }
        goal[15] = 0;
    }

    /**
     * Tarkastetaan onko peli ratkennut.
     *
     * @return true jos <code>tiles</code> vastaa voittolautaa
     * <code>goal</code>, muuten false.
     */
    public boolean checkVictory() {
        for (int i = 0; i < 15; i++) {
            if (tiles[i] != goal[i]) {
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
