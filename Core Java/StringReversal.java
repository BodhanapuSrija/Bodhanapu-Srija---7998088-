import java.util.Scanner;

class StringReversal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");

        String s = sc.nextLine(), r = "";

        for(int i=s.length()-1;i>=0;i--)
            r += s.charAt(i);

        System.out.println("Reversed = " + r);

    }
}