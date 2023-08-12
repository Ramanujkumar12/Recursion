/**
 * alternatesum
 */
public class alternatesum {

  static int Alternateaddition(int n) {
    if (n == 0)
      return n;
    if (n % 2 == 0) {
      return Alternateaddition(n - 1) - n;

    } else {
      return Alternateaddition(n - 1) + n;
    }
  }

  public static void main(String[] args) {

    System.out.println(Alternateaddition(4));

  }
}