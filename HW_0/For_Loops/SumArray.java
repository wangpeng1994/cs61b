public class SumArray {
  
  /** Use while. */
  public static int whileSum(int[] arr) {
    int i = 0; // initialization
    int sum = 0;
    while (i < arr.length) {
      sum = sum + arr[i];
      i++;
    }
    return sum;
  }

  /** Use for loops. */
  public static int forSum(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum = sum + arr[i];
    }
    return sum;
  }

  public static void main(String[] args) {
    int sum1 = whileSum(new int[]{4, 2, -1});
    int sum2 = forSum(new int[]{4, 2, -1});
    System.out.println("Result: " + "sum1: " + sum1 + ", sum2: " + sum2);
  }
}