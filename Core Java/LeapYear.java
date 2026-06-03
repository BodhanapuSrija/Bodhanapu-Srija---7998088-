import java.util.Scanner;

class LeapYear {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Year: ");

        int y = sc.nextInt();

        System.out.println((y%400==0 || y%4==0 && y%100!=0)
                ? "Leap Year"
                : "Not a Leap Year");
    }
}