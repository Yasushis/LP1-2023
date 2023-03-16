import java.util.Arrays;

public class tictactoe {

    public static void main(String[] args) {
        char[][] board = new char[3][3];

        for(int i = 0; i < 3; i++) {
            Arrays.fill(board[i], ' ');
        }

        //while (!win(board) || !old(board)) {
        showBoard(board);
        //}
    }


    public static void showBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }


    public static boolean old(char[][] board) {


        return false;
    }


    public static boolean win(char[][] board) {


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
            }
        }


        for (char[] linha : board) {
            for (char posicao : linha) {
            }
        }
        return false;
    }

}
