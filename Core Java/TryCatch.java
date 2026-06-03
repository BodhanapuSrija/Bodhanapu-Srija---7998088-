import java.util.Scanner;

class TryCatch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 2 Numbers: ");

        int a = sc.nextInt();
        int b = sc.nextInt();

        try {

            System.out.println("Result = " + (a/b));

        }

        catch(ArithmeticException e) {

            System.out.println("Cannot Divide by Zero");

        }

    }
}