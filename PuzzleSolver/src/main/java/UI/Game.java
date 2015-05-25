package UI;

import Game.Board;
import java.util.Scanner;

/**
 * Luokka <code>Game</code> on rakennettu pelilaudan simuloinnin testaamiseen
 * harjoitustyön varhaisessa vaiheessa. Sillä on yksinkertaiset
 * komentorivikomennot ja se tunnistaa ratkaistun laudan. Validointeja ei
 * pahemmin löydy. Osa metodeista tullaan siirtämään erilleen tekoälyä sekä varsinaista demoa varten.
 */
public class Game {

    private Board board;
    private Scanner scanner;

    /**
     * Konstruktori kutsuu metodia jolla luodaan maalipelilauta.
     */
    public Game() {
       
    }

    /**
     * Metodi on puhtaasti käyttäjätestausta varten. Metodi pyytää aluksi
     * käyttäjältä pelilaudan. Se käsittelee käyttäjän antamat siirrot ja
     * tulostaa pelilaudan tilanteen. Peli päättyy käyttäjän antaessa syötteen
     * lopeta tai pelin ratkettua.
     */
    public void play() {

        scanner = new Scanner(System.in);
        feedNumbers();

        while (true) {

            printBoard();

            if (board.checkVictory()) {
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
                board.moveTile(num);
            } else {
                System.out.println("Vääränlainen syöte!");
            }
            System.out.println("");
        }
    }

    /**
     * Metodi pyytää käyttäjältä 16 numeroa joista se muodostaa uuden
     * pelilaudan. Toistaiseksi validoidaan ainoastaan lukujen määrä.
     */
    private void feedNumbers() {
        int[] numbers = new int[16];
        while (true) {
            System.out.println("Anna rimpsuna numerot [0-15] joista haluat muodostaa pelilaudan. Erottele välilyönnillä: ");
            String num = scanner.nextLine();
            String[] list = num.split(" ");
            System.out.println("");

            if (list.length == 16) {
                for (int i = 0; i < 16; i++) {
                    numbers[i] = Integer.parseInt(list[i]);
                }
                board = new Board(numbers);
                break;
            } else {
                System.out.println("Pieleen meni :<");
            }
        }
    }


    /**
     * Tulostetaan pelilauta käyttäjän tarkasteltavaksi. Listasta tulostetaan
     * neljä numeroa yhdelle riville.
     */
    public void printBoard() {
        int[] boardNumbers = board.getBoard();
        int index = 0;

        while (index <= 15) {
            for (int j = 0; j < 4; j++) {
                System.out.print(boardNumbers[index] + " ");
                index++;
            }
            System.out.println("");
        }

    }
}