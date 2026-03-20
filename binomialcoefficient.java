public class binomialcoefficient {
    public static int binomialcoefficient(int n, int r) {
        int fact_n = (n);
        int fact_r = (r);
        int fact_nmr = (n - r);

        int binomialcoefficient = fact_n / (fact_r * fact_nmr);
        return binomialcoefficient;
    }

    public static void main(String[] args) {
        System.out.println(binomialcoefficient(5, 2));
    }

}
