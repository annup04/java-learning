public class funcparameters {

    // Function to calculate product
    public static int product(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {

        int a = 6;
        int b = 7;

        int result = product(a, b);

        System.out.println("Product = " + result);
    }
}