import java.util.Scanner;

public class funcparameters {


    public static void calculatesum(int num1, int num2)//parameters or formal parameters
    {
        int sum = num1 + num2;
        System.out.println("sum is :" + sum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        calculatesum(a, b);//arguments or actual parameters
    }
}