package connect4;

public interface State {
  public final static int ROWS = 6;
  public final static int COLS = 7;
  public final static char EMPTY = '.';
  public final static char CHECKER0 = 'X';
  public final static char CHECKER1 = 'O';
  public final static char [] CHECKERS = {CHECKER0, CHECKER1};


  public char [][] getBoard();


  public Player [] getPlayers();


  public int getPlayerNum ();


  public Player getPlayerToMove();


  public boolean isValidMove(int col);


  public void makeMove(int col);


  public boolean isFull();


  public boolean gameIsOver();
}
