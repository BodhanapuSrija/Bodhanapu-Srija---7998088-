import java.util.Scanner;

class TypeCasting {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Double Value: ");
        double a = sc.nextDouble();

        int b = (int)a;

        System.out.print("Enter Integer Value: ");
        int c = sc.nextInt();

        double d = c;

        System.out.println("Double to Int : " + b);
        System.out.println("Int to Double : " + d);

    }
}