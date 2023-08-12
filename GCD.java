import java.util.Scanner;

public class GCD {
    static int agcd(int x, int y) {
        while (x % y != 0) {
            int rem = x % y;
            x = y;
            y = rem;
        }
        return y;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number ");
        int x = sc.nextInt();
        System.out.println("Enter second number");
        int y = sc.nextInt();
        System.out.println("The GCD of " + x + "and" + y + "is equal to ");
        System.out.println(agcd(x, y));
    }
}
