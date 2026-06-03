import java.util.*;

class StudentMap {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<Integer,String> map = new HashMap<>();

        System.out.print("How Many Students: ");

        int n = sc.nextInt();

        for(int i=0;i<n;i++){

            System.out.print("Enter ID and Name: ");

            map.put(sc.nextInt(), sc.next());

        }

        System.out.print("Enter ID to Search: ");

        int id = sc.nextInt();

        System.out.println("Name : " + map.get(id));

    }
}