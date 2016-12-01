package connect4;

/**
<<<<<<< HEAD
 * Created by Kakashi on 01/12/2016.
 */
public class Board {

    public void BuildBoard()
    {

    int SizeCol=8;
    int SizeRow=6;
    int Table[][];

        System.out.println("\n ");
        Table = new int[SizeCol][SizeRow];
        for (int col = 0; col < SizeCol ; col++) {
        for (int row = 0; row < SizeRow; row++) {
            Table[col][row] = 0;

        }
        for (int ligne = SizeRow - 1; ligne >= 0; --ligne)
        {

            for (col = 0; col < SizeCol; col++) {

                System.out.print(" | ");


            }
            System.out.println();

        }
    }}
=======
 * Created by Esra on 01/12/2016.
 */
public class Board {
>>>>>>> origin/master
}
