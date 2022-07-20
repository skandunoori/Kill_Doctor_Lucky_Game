package driver;

import java.util.Random;

/**
 * Class to generate random values.
 *
 */
public class RandomClass {
  private Random random;
  private int[] arr;

  /**
   * Constructor initializes the random variable.
   */
  public RandomClass() {
    random = new Random();
  }

  /**
   * Constructor to initialize parameter.
   *
   * @param arr array of values
   */
  public RandomClass(int... arr) {

    if (arr == null) {
      throw new IllegalArgumentException("Array of int's is null");
    }
    this.arr = arr;
  }

  /**
   * Method to return random values.
   *
   * @param max maximum - 1 value needed from Java
   * @return random value generated
   */
  public int next(int max) {
    if (random == null) {
      return arr[0];
    } else {
      return random.nextInt(max);
    }

  }
}