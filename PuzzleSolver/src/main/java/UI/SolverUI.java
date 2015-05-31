/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import static AI.SolvabilityCheck.getSolvability;
import Game.Board;
import static Game.BoardFunctions.checkVictory;
import static Game.BoardFunctions.moveTile;
import static UI.UIFunctions.feedNumbers;
import static UI.UIFunctions.printBoard;
import Algorithms.DFS;
import java.util.Scanner;

/**
 * Tällä hetkellä ohjelma osaa ainoastaan syvyyshaen, eli ei siis toimi.
 * 
 * @author Johanna
 */
public class SolverUI {

    private DFS dfs;
    private Board board;
    private Scanner scanner;

    public void play() {

        board = new Board(feedNumbers());
        dfs = new DFS(board);

        if (!getSolvability(board)) {
            printBoard(board);
        
            System.out.println("Pelilauta ei ole ratkaistavissa :(");
        } else {

                printBoard(board);
                System.out.println("");
                dfs.DFSearch(board);
                System.out.println("Hakujen määrä: " + dfs.printCount());

        }
    }
}
