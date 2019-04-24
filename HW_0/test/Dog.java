public class Dog {
  public int weightInPounds;

  /** One integer constructor for dogs */
  public Dog(int w) {
    weightInPounds = w;
  }

  public void makeNoise() {
    if (weightInPounds > 10) {
      System.out.println("超重了~");
    } else {
      System.out.println("还凑合~");
    }
    System.out.println("Bark~~~");
  }
}