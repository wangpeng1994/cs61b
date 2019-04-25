public class BreakContinue {
  public static void windowPosSum(int[] a, int n) {
    for (int i = 0; i < a.length; i++) {
      if (a[i] < 0) {
        continue;
      }
      int v = 0;
      for (int j = i, m = 0; j < a.length; j++, m++) {
        if (m > n) {
          break;
        }
        System.out.println(a[j]);
        v = v + a[j];
      }
      System.out.println("---");
      a[i] = v;
    }
  }

  public static void main(String[] args) {
    /** Below is declare an array in Java with performming initialization. */
    int[] a = {1, 2, -3, 4, 5, 4};
    /** Or int[] a = new int[]{...}, none of these notations is better than any other. */
    int n = 3;
    windowPosSum(a, n);
    // Should print 4, 8, -3, 13, 9, 4
    System.out.println(java.util.Arrays.toString(a));
  }
}