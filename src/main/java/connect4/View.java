package connect4;

public interface View {

  public void display (State state);

  public int getUserMove(State state);

  public void reportToUser(String message);

  public String getAnswer(String question);
}
