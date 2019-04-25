public class MaxValue {
  /** Return the maximum value from m. */
  /** Ausume that all of the numbers are greater than or equal to zero. */
  public static int forMax(int[] m) {
    int maxValue = 0;
    for (int i = 0; i < m.length - 1; i++) { // Till penult number.
      if (m[i + 1] > m[i]) {
        maxValue = m[i + 1];
      } else {
        maxValue = m[i];
      }
    }
    return maxValue;
  }

  public static void main(String[] args) {
    int[] numbers = new int[]{4, 10, 5, 12, 28, 7};
    int maxValue = forMax(numbers);
    System.out.println(maxValue);
  }
}