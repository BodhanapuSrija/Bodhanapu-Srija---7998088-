import java.io.FileWriter;
import java.util.Scanner;

class FileWrite {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text: ");

        String s = sc.nextLine();

        FileWriter f = new FileWriter("output.txt");

        f.write(s);

        f.close();

        System.out.println("Data Written Successfully");

    }
}