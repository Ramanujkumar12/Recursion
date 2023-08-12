public class countofdigits {
    static int cod(int n) {
        // Base case
        if (n >= 0 && n <= 9)
            return 1;
        // Recursive statement
        int ans = cod(n / 10);
        ans++;
        return ans;

    }

    public static void main(String[] args) {
        System.out.println(cod(345677432));
    }
}
