import java.lang.reflect.*;
import java.util.Scanner;

class Demo {

    public void show(String name){

        System.out.println("Hello " + name);

    }
}

class ReflectionDemo {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");

        String n = sc.nextLine();

        Class c = Class.forName("Demo");

        Object o = c.getDeclaredConstructor().newInstance();

        for(Method m : c.getDeclaredMethods()){

            System.out.println("Method : " + m.getName());

            m.invoke(o,n);

        }
    }
}