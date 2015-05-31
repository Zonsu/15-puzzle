package UI;

import Game.Board;

import static Game.BoardFunctions.*;
import static AI.SolvabilityCheck.*;
import static UI.UIFunctions.*;
import java.util.Scanner;

/**
 * Luokka <code>GameUI</code> on rakennettu pelilaudan simuloinnin testaamiseen
 * harjoitustyön varhaisessa vaiheessa. Sillä on yksinkertaiset
 * komentorivikomennot ja se tunnistaa ratkaistun laudan. Validointeja ei
 * pahemmin löydy. Osa metodeista tullaan siirtämään erilleen tekoälyä sekä
 * varsinaista demoa varten.
 */
public class GameUI {

    private Board board;
    private Scanner scanner;

    /**
     * Konstruktori kutsuu metodia jolla luodaan maalipelilauta.
     */
    public GameUI() {

    }

    /**
     * Metodi on puhtaasti käyttäjätestausta varten. Metodi pyytää aluksi
     * käyttäjältä pelilaudan. Se käsittelee käyttäjän antamat siirrot ja
     * tulostaa pelilaudan tilanteen. Peli päättyy käyttäjän antaessa syötteen
     * lopeta, pelin ratkettua tai jos pelilauta ei ole ratkaistavissa.
     */
    public void play() {

        scanner = new Scanner(System.in);
        board = new Board(feedNumbers());

        if (!getSolvability(board)) {
            printBoard(board);
            System.out.println("Pelilauta ei ole ratkaistavissa :(");
        } else {

            while (true) {

                printBoard(board);

                if (checkVictory(board)) {
                    System.out.println("Voitto!");
                    break;
                }

                System.out.println("Kirjoita numero jonka haluat siirtää [1-15]. Tyhjä ruutu on 0. 'Lopeta' lopettaa");
                String input = scanner.nextLine();

                if (input.equals("lopeta") || input.equals("Lopeta")) {
                    break;
                }
                int num = Integer.parseInt(input);
                if (num > 0 && num < 16) {
                    System.out.println("Yritetään siirtää " + num);
                    board = moveTile(num, board);
                } else {
                    System.out.println("Vääränlainen syöte!");
                }
                System.out.println("");
            }
        }
    }

}
