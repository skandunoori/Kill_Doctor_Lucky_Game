package controller;

import theworld.BoardGameModel;

/**
 * This class is a part of command design pattern to execute of the turn looking
 * around a particular space.
 */
public class LookAround implements GameController {
  private final String playername;
  private String outputmessage;

  /**
   * Construct a LookAround object that has the name of the player which 
   * gives information about the current player space and the 
   * neighboring spaces.
   *
   * @param playername the name of the player
   */
  public LookAround(String playername) throws IllegalArgumentException {
    if (playername == null || "".equals(playername.trim())) {
      throw new IllegalArgumentException("Invalid Player name");
    }
    this.playername = playername;
    this.outputmessage = "";
  }

  @Override
  public void execute(BoardGameModel b) throws IllegalArgumentException {
    if (b == null) {
      throw new IllegalArgumentException("Model cannot be null");
    }
    this.outputmessage = b.lookAround(this.playername);
  }

  @Override
  public String getOutput() {
    return this.outputmessage;
  }
}
