
import java.util.Scanner;
public class TestGame {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Board game = new Board(3, 3);
        game.initializeBoarad();
        String player = "X";
        do{
            game.printBoard();
            System.out.println("Enter cordinates for raws: ");
            int raw=input.nextInt();
            System.out.println("Enter cordinates for columns: ");
            int column = input.nextInt();
            game.setPlay(raw, column, player);
            if (game.isGameover()){
                System.out.println(" Winner ...."); game.printBoard();
                break;
            }
        if(player == "X")
            player = "O";
        else
            player = "X";
        } while(true);


    }

}
