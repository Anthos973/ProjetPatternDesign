package connect4;

import java.util.Arrays;


public class Game implements State{
  private char[][] board;

  private Player [] players;
  private int playerToMoveNum;

  private int latestRow = -1;
  private int latestCol = -1;

  private int movesDone;

  private int evalValue;


  public Game(int playerNum, Player [] thePlayers){
    board = new char[ROWS][COLS];

    for (char[] row : board){
      Arrays.fill(row, EMPTY);
    }

    playerToMoveNum = playerNum;
    players = thePlayers;

    movesDone = 0;
    evalValue = 0;
  }

  @Override
  public char[][] getBoard() {
    return board;
  }

  @Override
  public Player[] getPlayers() {
    return players;
  }

  @Override
  public int getPlayerNum() {
    return playerToMoveNum;
  }

  @Override
  public Player getPlayerToMove() {
    return players[playerToMoveNum];
  }

  @Override
  public boolean isValidMove(int col) {
    return !isColumnFull(col);
  }


  @Override
  public void makeMove(int col) {
    if (isValidMove(col)){
      int openRow = findOpenRow(col);

      playerToMoveNum = 1 - playerToMoveNum;

      board[openRow][col] = CHECKERS[getPlayerNum()];

      movesDone++;

      latestRow = openRow;
      latestCol = col;
    } else {
      System.out.println("La colonne est pleine !");
    }
  }

  private int findOpenRow(int col){
    for (int i = 0; i < ROWS; i++){
      if (board[i][col] == EMPTY){
        return i;
      }
    }

    return -1;
  }

  private boolean isColumnFull(int col) {
    return !(board[ROWS - 1][col] == EMPTY);
  }

  @Override
  public boolean isFull() {
    return (movesDone == ROWS * COLS);
  }

  private boolean checkForFour(int row, int column,
                               int rowOffset, int colOffset){

    int winCounter = 0;
    int oppRow = 3 * rowOffset + row;
    int oppColumn = 3 * colOffset + column;

    // conditions où la puissance 4 est impossible
    if ( (movesDone < 7 ) || (oppRow >= ROWS) || (oppColumn >= COLS) ||
      (oppRow < 0) || (oppColumn < 0) ||
      (row < 0) || (column < 0) ||
      (row >= ROWS) || (column >= COLS)){
      return false;
    }

    for (int i = 1; i < 5; i++){
      if (board[row][column] == CHECKERS[playerToMoveNum]){

        winCounter++;
      }

      row += rowOffset;
      column += colOffset;
    }

    return (winCounter == 4);
  }


  @Override
  public boolean gameIsOver() {

    if ( isFull() ){
      return true;
    }

    // Verticale
    if ( checkForFour(latestRow, latestCol, -1, 0)) return true;

    for (int offset = 0; offset < 4; offset++){
      // horizontale
      if ( checkForFour(latestRow, latestCol - offset, 0, 1)) return true;

      // diagonale du bas droit
      if ( checkForFour(latestRow - offset, latestCol + offset, 1, -1)) return true;

      // diagonale du haut droit
      if ( checkForFour(latestRow - offset, latestCol - offset, 1, 1)) return true;
    }

    return false;
  }

}
