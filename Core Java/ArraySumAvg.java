import java.util.Scanner;

class ArraySumAvg {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size: ");

        int n = sc.nextInt(), sum = 0;

        int a[] = new int[n];

        System.out.println("Enter Elements:");

        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
            sum += a[i];
        }

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + (double)sum/n);

    }
}