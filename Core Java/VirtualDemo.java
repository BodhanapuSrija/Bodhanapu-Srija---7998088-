import java.util.Scanner;

class VirtualDemo {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Threads: ");

        int n = sc.nextInt();

        long s = System.currentTimeMillis();

        for(int i=1;i<=n;i++){

            int x = i;

            Thread.startVirtualThread(() ->
                System.out.println("Virtual Thread " + x)
            );
        }

        Thread.sleep(1000);

        long e = System.currentTimeMillis();

        System.out.println("Time : " + (e-s) + " ms");

    }
}