import java.util.concurrent.*;
import java.util.*;

class ExecutorDemo {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        ExecutorService ex = Executors.newFixedThreadPool(2);

        System.out.print("Enter 2 Numbers: ");

        int a = sc.nextInt();
        int b = sc.nextInt();

        Callable<Integer> t1 = () -> a*a;
        Callable<Integer> t2 = () -> b*b;

        Future<Integer> f1 = ex.submit(t1);
        Future<Integer> f2 = ex.submit(t2);

        System.out.println("Result 1 : " + f1.get());
        System.out.println("Result 2 : " + f2.get());

        ex.shutdown();

    }
}