import java.util.Scanner;

/**
 * reversenaturalnumbers
 */
public class reversenaturalnumbers {

    static void reverseingnumbers(int n) {
        if (n == 1) {
            System.out.println(n + " ");
            return;
        }
        System.out.print(n + " ");
        reverseingnumbers(n - 1);

    }

    public static void main(String[] args) {
        System.out.println("Enter number to find the natural numbers");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        reverseingnumbers(n);
    }
}