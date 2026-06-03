import java.util.Scanner;

class FactorialCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");

        int n = sc.nextInt(), f = 1;

        for(int i=1;i<=n;i++)
            f *= i;

        System.out.println("Factorial = " + f);

    }
}