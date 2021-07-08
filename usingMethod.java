package TicTacToe;
import java.util.Scanner;

public class usingMethod {
    static char[] board = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
    static char turn = 'X';

    static void playBox() {
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8] + " ");
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5] + " ");
        System.out.println("---+---+---");
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2] + " ");
    }

    static void isWinner() {
        if (
                board[0] == turn && board[1] == turn && board[2] == turn ||
                        board[3] == turn && board[4] == turn && board[5] == turn ||
                        board[6] == turn && board[7] == turn && board[8] == turn ||
                        board[0] == turn && board[3] == turn && board[6] == turn ||
                        board[1] == turn && board[4] == turn && board[7] == turn ||
                        board[2] == turn && board[5] == turn && board[8] == turn ||
                        board[0] == turn && board[4] == turn && board[8] == turn ||
                        board[2] == turn && board[4] == turn && board[6] == turn
        ) {
            System.out.println("Player "+turn + " is the winner\n");
            System.exit(0);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n**Welcome to the TicTacToe Game!**\n");
        System.out.println("**Player X will go first**");
        System.out.println("**Player O will go second**\n");

        int input;
        int currentTurn = 1;
        playBox();
        while (true) {
            do {
                System.out.print("\nEnter the position: ");
                input = scanner.nextInt();
            }
            while (board[input - 1] == 'X' || board[input - 1] == 'O');
            board[input - 1] = turn;
            playBox();
            isWinner();
            if (turn == 'X') {
                turn = 'O';
            } else if (turn == 'O') {
                turn = 'X';
            }
            currentTurn++;
            if (currentTurn > 9) {
                System.out.println("\nNo more turns remaining");
                break;
            }

        }
    }
}