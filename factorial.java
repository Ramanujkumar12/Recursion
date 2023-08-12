public class factorial {
    static int factorization(int n) {
        if (n == 0)
            return 1;

        int smallans = factorization(n - 1);

        return n * smallans;

    }

    public static void main(String[] args) {
        System.out.println(factorization(5));
    }
}
