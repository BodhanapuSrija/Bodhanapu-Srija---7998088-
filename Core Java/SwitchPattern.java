import java.util.Scanner;

class SwitchPattern {

    static void check(Object o){

        switch(o){

            case Integer i -> System.out.println(i + " is Integer");

            case Double d -> System.out.println(d + " is Double");

            case String s -> System.out.println(s + " is String");

            default -> System.out.println("Unknown Type");

        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Value: ");

        String v = sc.nextLine();

        try{
            check(Integer.parseInt(v));
        }

        catch(Exception e1){

            try{
                check(Double.parseDouble(v));
            }

            catch(Exception e2){
                check(v);
            }
        }
    }
}