package connect4;


public class Connect4Controller {
  public static void main(String [] args){

    View view = null;
    view = new Text();


    Player [] players = new Player[2];


    String playerName = view.getAnswer("Entrer le nom du Joueur 1 :");

      players[0] = new Player(playerName);


    playerName = view.getAnswer("Entrer le nom du Joueur 2 :");

      players[1] = new Player(playerName);

    Game state = new Game(0, players);

    view.display(state);

    while (!state.gameIsOver()){
      int move = state.getPlayerToMove().getMove(state, view);

      state.makeMove(move);
      view.display(state);
    }


    view.reportToUser(state.getPlayers()[1 - state.getPlayerNum()].getName() + " a gagné!");

  }
}
