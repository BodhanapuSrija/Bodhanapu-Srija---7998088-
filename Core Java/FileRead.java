import java.io.File;
import java.util.Scanner;

class FileRead {

    public static void main(String[] args) throws Exception {

        File f = new File("output.txt");

        Scanner sc = new Scanner(f);

        while(sc.hasNextLine())
            System.out.println(sc.nextLine());

        sc.close();

    }
}