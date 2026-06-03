import java.util.Scanner;

class MethodOverloading {

    int add(int a,int b){
        return a+b;
    }

    double add(double a,double b){
        return a+b;
    }

    int add(int a,int b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        MethodOverloading o = new MethodOverloading();

        System.out.print("Enter 2 Integers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.print("Enter 2 Doubles: ");
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();

        System.out.print("Enter 3 Integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Sum1 = " + o.add(x,y));
        System.out.println("Sum2 = " + o.add(d1,d2));
        System.out.println("Sum3 = " + o.add(a,b,c));

    }
}