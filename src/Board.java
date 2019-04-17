public class Board {

    //Defining the board
    String[][] board;
    int raws;
    int columns;

    Board(int raws, int columns) {
        this.raws  = raws;
        this.columns = columns;
        board = new String[raws][columns];
    }

    //initializing the board

    void initializeBoarad() {
        for (int i = 0; i < raws; i++) {
            for (int j = 0; j < columns; j++) {
                board[i][j] = "-";
            }
        }
    }

   // setting player move

    public void setPlay(int i, int j, String player){
        if(this.board[i][j].equals("-")){
            board[i][j] = player;
        } else if(this.board[i][j].equals("X") || this.board[i][j].equals("O")){
            System.out.println("try again");

        }
    }

    //checking the end of game

    public boolean isGameover(){
        //checking raws
        for(int i = 0; i<raws; i++) {
            if (!board[i][0].equals("-") && board[i][0].equals(board[i][1]) && board[i][1].equals(board[i][2]))//change 012 for the other case
                return true;
            }

            //checking columns
        for (int j = 0; j < columns; j++) {
            if (!board[0][j].equals("-") && board[0][j].equals(board[1][j]) && board[1][j].equals(board[2][j])) //change 012 for the other case
                return true;
            }
            //checking diagonals
            if(!board[0][0].equals("-") && board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]))
                return true;
            if(!board[0][2].equals("-") && board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0]))
                return true;
            return false;
    }



       //printing the board

    public void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < raws; i++) {
            System.out.print("| ");
            for (int j = 0; j < columns; j++) {
              System.out.print(board[i][j] + " | ");
                }
            System.out.println();
            System.out.println("-------------");
                 }
        }


    }










