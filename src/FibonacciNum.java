import java.util.Scanner;

public class FibonacciNum {

    static int a= 0, b=1, c=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print(a + " " + b + " ");
        printFibonacci(num - 2);
    }

    static void printFibonacci(int num){
        if(num > 0){
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
            printFibonacci(num - 1);
        }
    }
}
