import java.util.*;
import java.util.stream.*;

record Person(String name,int age){}

class RecordDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Person> list = new ArrayList<>();

        System.out.print("How Many Persons: ");

        int n = sc.nextInt();
        sc.nextLine();

        for(int i=0;i<n;i++){

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            list.add(new Person(name,age));

        }

        list.stream()
            .filter(p -> p.age() >= 18)
            .forEach(System.out::println);

    }
}