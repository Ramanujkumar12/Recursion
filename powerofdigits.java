public class powerofdigits {

    static int pod(int p, int q) {
        if (q == 0)
            return 1;
        int smallans = pod(p, q - 1);
        return p * smallans;
    }

    public static void main(String[] args) {
        System.out.println(pod(2, 3));
    }
}
