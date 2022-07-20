package controller;

import theworld.BoardGameModel;

/**
 * This class is a part of command design pattern to execute of the turn moving
 * a pet.
 */
public class MovePet implements GameController {
  private final String playername;
  private final String roomtobemovedto;
  private String outputMessage;

  /**
   * Construct a MovePet object that has the name of the player and the space 
   * to move the pet to.
   *
   * @param playername the name of the current player
   * @param roomtobemovedto name of the room to be moved to
   */
  public MovePet(String playername, String roomtobemovedto) {
    if (playername == null || "".equals(playername.trim())) {
      throw new IllegalArgumentException("Invalid Player name");
    }
    if (roomtobemovedto == null || "".equals(roomtobemovedto.trim())) {
      throw new IllegalArgumentException("Invalid space name");
    }
    this.playername = playername;
    this.roomtobemovedto = roomtobemovedto;
    this.outputMessage = "";
  }

  @Override
  public void execute(BoardGameModel b) throws IllegalArgumentException, IllegalStateException {
    if (b == null) {
      throw new IllegalArgumentException("model cannot be null");
    }
    this.outputMessage = b.movePet(this.roomtobemovedto);
  }

  @Override
  public String getOutput() {
    return this.outputMessage;
  }
}
