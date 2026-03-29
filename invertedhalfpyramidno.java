public class invertedhalfpyramidno {
    public static void inverted_rotated_half_pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            // inner no
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.println(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // inverteshalfpyramid
        inverted_rotated_half_pyramid(7);
    }

}
