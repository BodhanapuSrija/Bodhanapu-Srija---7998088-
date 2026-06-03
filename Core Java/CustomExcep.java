import java.util.Scanner;

class InvalidAgeException extends Exception {

    InvalidAgeException(String msg){

        super(msg);

    }
}

class CustomExcep {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Age: ");

        int age = sc.nextInt();

        try {

            if(age < 18)
                throw new InvalidAgeException("Age Must Be 18+");

            System.out.println("Eligible");

        }

        catch(InvalidAgeException e) {

            System.out.println(e.getMessage());

        }

    }
}