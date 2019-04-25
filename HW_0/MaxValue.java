public class MaxValue {
  /** Return the maximum value from m. */
  /** Ausume that all of the numbers are greater than or equal to zero. */
  public static int max(int[] m) {
    int maxValue = 0;
    int curIdx = 0;
    while (curIdx < m.length - 1) {
      if (m[curIdx + 1] > m[curIdx]) {
        maxValue = m[curIdx + 1];
      } else {
        maxValue = m[curIdx];
      }
      curIdx = curIdx + 1;
    }
    return maxValue;
  }
  public static void main(String[] args) {
    int[] numbers = new int[]{4, 10, 5, 12, 34};
    int maxValue = max(numbers);
    System.out.println(maxValue);
  }
}