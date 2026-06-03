import java.util.Scanner;

class Car {

    String make, model;
    int year;

    void displayDetails() {

        System.out.println("\nCar Details");
        System.out.println("Make : " + make);
        System.out.println("Model : " + model);
        System.out.println("Year : " + year);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Car c = new Car();

        System.out.print("Enter Make: ");
        c.make = sc.nextLine();

        System.out.print("Enter Model: ");
        c.model = sc.nextLine();

        System.out.print("Enter Year: ");
        c.year = sc.nextInt();

        c.displayDetails();

    }
}