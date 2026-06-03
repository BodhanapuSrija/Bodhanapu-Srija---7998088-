import java.util.Scanner;

class Palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");

        String s = sc.nextLine().replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        String r = new StringBuilder(s).reverse().toString();

        System.out.println(s.equals(r) ? "Palindrome" : "Not Palindrome");

    }
}