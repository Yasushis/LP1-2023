import java.util.Scanner;

public class tictactoe {

    public static void main(String[] args) {

        char board[][] = {{'1','2','3'},
                          {'4','5','6'},
                          {'7','8','9'}};


        char X = 'X';
        char O = 'O';


        showBoard(board);

        while(true){

            playerTurn(board, X);
            if(checkWin(board, X)){
                break;
            }
            showBoard(board);

            playerTurn(board, O);
            if(checkWin(board, O)){
                break;
            }
            showBoard(board);
        }


        }


        public static void playerTurn(char[][] board, char symbol){

            Scanner scan = new Scanner(System.in);

            String opcao;

            System.out.println("Vez do jogador " + symbol);

            while(true){
            opcao = scan.nextLine();
            if (validation(board, opcao)) {
                break;
            }

            else {
                System.out.println("Digite uma posição válida!");
            }

            }
            switch(opcao){
                case "1":
                board[0][0] = symbol;
                break;
    
                case "2":
                board[0][1] = symbol;
                break;
    
                case "3":
                board[0][2] = symbol;
                break;
    
                case "4":
                board[1][0] = symbol;
                break;
    
                case "5":
                board[1][1] = symbol;
                break;
    
                case "6":
                board[1][2] = symbol;
                break;
    
                case "7":
                board[2][0] = symbol;
                break;
    
                case "8":
                board[2][1] = symbol;
                break;
    
                case "9":
                board[2][2] = symbol;
                break;
             }
            
        }


        public static boolean checkWin(char[][] board, char symbol){

            int g;
            int h;
            int a = 0;

            for (g = 0;g < 3; g++) {
                for (h = 0; h < 3; h++) {
                    if (board[g][h] != 'X' && board[g][h] != 'O') {
                        a = a + 1;
                    }
                }
            }

            if((board[0][0] == symbol && board[0][1] == symbol && board[0][2] == symbol) ||
               (board[1][0] == symbol && board[1][1] == symbol && board[1][2] == symbol) ||
               (board[2][0] == symbol && board[2][1] == symbol && board[2][2] == symbol) ||
               (board[0][0] == symbol && board[1][0] == symbol && board[2][0] == symbol) ||
               (board[0][1] == symbol && board[1][1] == symbol && board[2][1] == symbol) ||
               (board[0][2] == symbol && board[1][2] == symbol && board[2][2] == symbol) ||
               (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) ||
               (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol)) {
                showBoard(board);
                System.out.println("Jogador " + symbol + " ganhou!");
                return true;
               }

               else if (a == 0){
                    showBoard(board);
                    System.out.println("Deu velha!");
                    return true;
               }

               else {
                return false;
               }
               
 }
    

        public static boolean validation(char[][] board, String opcao) {

            switch(opcao){
                case "1":
                return (board[0][0] == '1');
            
                case "2":
                return (board[0][1] == '2');
                
    
                case "3":
                return (board[0][2] == '3');
               
    
                case "4":
                return (board[1][0] == '4');
                
    
                case "5":
                return (board[1][1] == '5');
              
    
                case "6":
                return (board[1][2] == '6');
                
    
                case "7":
                return (board[2][0] == '7');
                
    
                case "8":
                return (board[2][1] == '8');
                
    
                case "9":
                return (board[2][2] == '9');

                default:
                return false;
                
             }

        }


        public static void showBoard(char[][] board) {

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(board[i][j]);

                    if(j<2){
                        System.out.print("|");
                    }
                }

                System.out.println();

            if(i<2){
                System.out.println("-----");
            }
            }
        }



}
