package theworld;

import java.util.List;

/**
 * A Board Game Interface represents the data of the world and contains the list
 * of methods to related to the World operation.
 */
public interface ReadOnlyBoardGameModel extends BoardGameModel {

  /**
   * Gets the target character entity.
   *
   * @return the object of the target character
   */
  public TargetCharacterInterface getTargetCharacterImpl();

  /**
   * Gets the target pet entity.
   *
   * @return the object of the target pet
   */
  public PetInterface getTargetPetImpl();

  /**
   * Gets the world name.
   *
   * @return the world name.
   */
  public String getName();

  /**
   * Gets the list of spaces in the world.
   *
   * @return the List of spaces
   */
  public List<SpaceImpl> getSpaceList();

  /**
   * Gets the world coordinates in the form of a list.
   *
   * @return the List of Integers
   */
  public List<Integer> getWorldCoordinates();

  /**
   * Gets the players in the game.
   *
   * @return list of players in the world
   */
  public List<PlayerImpl> getPlayerList();

  /**
   * Gets the next location for the target character to move.
   *
   * @return string of the room the target character has moved to
   */
  public String getNextTargetCharacterRoom() throws IllegalStateException;

  /**
   * Method to move pet using Depth First Traversal logic.
   *
   * @param petcurrentroom name of the player
   * 
   * @return the next room of the pet movement in DFS.
   */
  public String petMovementDfs(String petcurrentroom);

  /**
   * This method gets the current turn of the player.
   *
   * @return the name of current player.
   */
  public String getCurrentPlayerTurn();

  /**
   * This method returns the remaining turns in the game.
   *
   * @return the remaining number of turns in the game.
   */
  public int getTurns();

}
