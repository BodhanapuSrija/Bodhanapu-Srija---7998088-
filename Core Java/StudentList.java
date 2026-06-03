import java.util.*;

class StudentList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        System.out.print("How Many Names: ");

        int n = sc.nextInt();
        sc.nextLine();

        for(int i=0;i<n;i++)
            list.add(sc.nextLine());

        System.out.println("\nStudent Names");

        for(String s : list)
            System.out.println(s);

    }
}