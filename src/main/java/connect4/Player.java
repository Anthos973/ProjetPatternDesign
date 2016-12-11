package connect4;

/**
 * Created by Esra on 03/12/2016.
 */

public class Player {
  private String playerName;

  public Player (String name) {
    playerName = name;
  }

  public String getName() {
    return playerName;
  }

  public int getMove(State state, View view){
    return view.getUserMove(state);
  }

}
