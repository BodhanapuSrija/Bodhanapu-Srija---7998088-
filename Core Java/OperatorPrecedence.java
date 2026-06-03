import java.util.Scanner;

class OperatorPrecedence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 3 Numbers: ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int r = a + b * c;

        System.out.println("Result = " + r);

    }
}