import java.util.*;
import java.util.stream.*;

class StreamDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        System.out.print("How Many Numbers: ");

        int n = sc.nextInt();

        for(int i=0;i<n;i++)
            list.add(sc.nextInt());

        List<Integer> even = list.stream()
                                 .filter(x -> x%2==0)
                                 .collect(Collectors.toList());

        System.out.println("Even Numbers : " + even);

    }
}