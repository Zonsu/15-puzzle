/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Game.Board;
import java.util.Scanner;

/**
 *
 * @author Johanna
 */
public class UIFunctions {

    private static int[] feedNumbers() {
        Scanner scanner = new Scanner(System.in);
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
                break;
            } else {
                System.out.println("Pieleen meni :<");
            }
        }
        return numbers;
    }

    public static void printBoard(Board board) {
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
