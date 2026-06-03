import java.util.*;

class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = (int)(Math.random()*100)+1, g;

        do{

            System.out.print("Guess Number (1-100): ");
            g = sc.nextInt();

            if(g>n)
                System.out.println("Too High");

            else if(g<n)
                System.out.println("Too Low");

        }while(g!=n);

        System.out.println("Correct Guess!");

    }
}