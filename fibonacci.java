public class fibonacci {
    static int series(int n) {
        if (n == 1)
            return 1;
        if (n == 0)
            return 0;

        int smallans_1 = series(n - 1);
        int smallans_2 = series(n - 2);
        int ans = smallans_1 + smallans_2;
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(series(8));
    }
}
