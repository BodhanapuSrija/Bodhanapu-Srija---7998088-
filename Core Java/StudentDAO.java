import java.sql.*;
import java.util.Scanner;

class StudentDAO {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/college",
            "root",
            "root"
        );

        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        PreparedStatement ps = con.prepareStatement(
            "insert into students values(?,?)"
        );

        ps.setInt(1,id);
        ps.setString(2,name);

        ps.executeUpdate();

        System.out.println("Record Inserted");

        System.out.print("Enter New Name: ");
        String n = sc.nextLine();

        PreparedStatement ps2 = con.prepareStatement(
            "update students set name=? where id=?"
        );

        ps2.setString(1,n);
        ps2.setInt(2,id);

        ps2.executeUpdate();

        System.out.println("Record Updated");

        con.close();

    }
}