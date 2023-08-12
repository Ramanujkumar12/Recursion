import java.util.Scanner;

/**
 * printingnaturalnumbers
 */
public class printingnaturalnumbers {

    static void printincrasing(int n) {

        if (n == 1) {
            System.out.print(n + " ");
            return;

        }

        printincrasing(n - 1);
        System.out.print(n + " ");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no to be printed");
        int n = sc.nextInt();
        printincrasing(n);
    }
}