
import java.sql.*;
        import java.util.*;
class Sql_CRUD_Operation
{
    public static void main(String a[])
    {
        //Creating the connection

        String url = "jdbc:mysql://localhost:3306/abc";
        String user = "root";
        String pass = "Udk@3654";

        //Entering the data
        Scanner k = new Scanner(System.in);
        System.out.println("enter name");
        String name = k.next();
        System.out.println("enter roll no");
        int roll = k.nextInt();
        System.out.println("enter class");
        String cls = k.next();

        //Inserting data using SQL query
        String sql = "insert into student1 values('"+name+"',"+roll+",'"+cls+"')";
        Connection con=null;
        try
        {
            con = DriverManager.getConnection(url,user,pass);

            Statement st = con.createStatement();
            int m = st.executeUpdate(sql);
            if (m == 1) {
                System.out.println("inserted successfully : " + sql);
            }

            else {
                System.out.println("insertion failed");
            }
            System.out.println("-----------------------");
            System.out.println("insertion completed");
            System.out.println("-----------------");
            System.out.println("select query started::");
            ResultSet rs=st.executeQuery("select * from student1");
            while (rs.next()==true){
                System.out.println(rs.getString(1)+" "+ rs.getInt(2)+" "+rs.getString(3));
            }
            System.out.println("select query completed");
            st.executeUpdate("delete from student1 where name='jeva' ");
            System.out.println("______________");
            System.out.println("update query Started");
            st.executeUpdate("update student1 set name='ramu', rollno=34 ,cls='qa' where name ='dileep'");
            System.out.println("Update query completed");
            rs.close();
            con.close();
        }
        catch(Exception ex)
        {
            System.err.println(ex);
        }
    }



}


