package connect4;
import java.util.Scanner;


/**
 * Created by Kakashi on 01/12/2016.
 */

public class Players
{
    protected static Scanner scanner = new Scanner(System.in);


    void CreatePlayer()
    {
        for (int i=1; i<3;i++) {

            System.out.println("Player" + i + " \nEnter your name: ");
            String NamePlayer1 = scanner.nextLine();
            System.out.println("--");
            System.out.println("You entered: " + NamePlayer1);
            System.out.println("\n");


        }


    }




}
