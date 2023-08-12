public class kmultiples {
    static int kmultiplication(int n, int k) {
        if (k == 1)
            return n * 1;
        return n * kmultiplication(n, k - 1);

    }

    public static void main(String[] args) {
        System.out.println(kmultiplication(2, 5));
    }
}
