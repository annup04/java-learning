import java.util.Scanner;

public class funcparameters {
    public static void printHelloWorld() {
        System.out.println("HEllo world");
        System.out.println("HEllo world");
        System.out.println("HEllo world");
        return;
    }

    public static void calculateSum(){
 Scanner sc= new Scanner (System.in);
   int a =sc.nextInt();
   int b=sc.nextInt();
   int sum =a+b;
System.out.println("sum is"+sum);
    }

    public static void main(String[] args) {
        calculateSum();
    }
}
