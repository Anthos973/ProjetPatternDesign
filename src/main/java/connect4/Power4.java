package connect4;

/**
 * Created by Kakashi on 24/11/2016.
 */
public class Power4 {


    public static void main(String[] args)
    {

        Players player = new Players();
        player.CreatePlayer();

<<<<<<< HEAD
        Board  board = new Board();
        board.BuildBoard();
=======
        System.out.println("Players 1 \nEnter your name: ");
        String NamePlayer1 = scanner.nextLine();
        System.out.println("--");
        System.out.println("You entered: " + NamePlayer1);
        System.out.println("\n");

        System.out.println("Players 2 \n Enter your name : ");
        String NamePlayer2 = scanner2.nextLine();
        System.out.println("--");
        System.out.println("You entered: " + NamePlayer2);

         int SizeCol=7;
         int SizeRow=6;
         int Table[][];

        System.out.println("\n ");
        Table = new int[SizeCol][SizeRow];
        for (int col = 0; col < SizeCol ; col++) {
            for (int row = 0; row < SizeRow; row++) {
                Table[col][row] = 0;
>>>>>>> origin/master

    }


}
