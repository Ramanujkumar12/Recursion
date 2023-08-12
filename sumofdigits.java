public class sumofdigits {
    static int sumofnumbers(int n) {
        // Base case
        if (n >= 0 && n <= 9)
            return n;
        // Recursive statement
        int smallans = sumofnumbers(n / 10);

        return smallans + n % 10;

    }

    public static void main(String[] args) {
        System.out.println(sumofnumbers(2345));
    }
}
