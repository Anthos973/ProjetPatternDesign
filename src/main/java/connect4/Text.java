package connect4;

import java.util.Scanner;

public class Text implements View {
  private Scanner input;

  public Text() {
    input = new Scanner(System.in);
  }

  public void display(State state) {
    char[][] board = state.getBoard();

    for (int row = state.ROWS - 1; row > -1; row--) {
      System.out.print(row + " |");
      for (int column = 0; column < state.COLS; column++) {
        System.out.print(board[row][column]);
        System.out.print(" ");
      }
      System.out.println("\n");
    }

    System.out.print("  ");
    for (int column = 0; column < state.COLS; column++) {
      System.out.print(" " + column);
    }
    System.out.println("\n");
  }

  public int getUserMove(State state) {
    Scanner column;
    int choose;

    System.out.println();
    System.out.println("Entrer une colonne : ");

    column = new Scanner(System.in);

    for (; ; ) {
      if (!column.hasNextInt()) {
        System.out.println("Seul les chiffres de 0 à 6 sont autorisés !");
        System.out.println("Entrer une colonne : ");
        column.next(); // discard
        continue;
      }
      choose = column.nextInt();
      if ((choose < 0) || (choose > state.COLS - 1)) {
        System.out.println("Colonne innexistant, veuillez recommencer !");
        System.out.println("Entrer une colonne :");
        continue;
      }
      break;
    }

    return choose;
  }


  public void reportToUser(String message) {
    System.out.println(message);
  }


  public String getAnswer(String question) {
    System.out.println(question + " ");

    return input.nextLine();

  }
}

