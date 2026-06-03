import java.util.Scanner;

class DataTypes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Integer: ");
        int a = sc.nextInt();

        System.out.print("Enter Float: ");
        float b = sc.nextFloat();

        System.out.print("Enter Double: ");
        double c = sc.nextDouble();

        System.out.print("Enter Character: ");
        char d = sc.next().charAt(0);

        System.out.print("Enter Boolean: ");
        boolean e = sc.nextBoolean();

        System.out.println("\nInt : " + a);
        System.out.println("Float : " + b);
        System.out.println("Double : " + c);
        System.out.println("Char : " + d);
        System.out.println("Boolean : " + e);
    }
}