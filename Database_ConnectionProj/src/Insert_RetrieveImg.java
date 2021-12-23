import java.io.*;
import java.util.Scanner;
import java.sql.*;

class Insert_RetrieveImg {
    public static void main(String a[]) throws SQLException, IOException {
        //Creating the connection
        PreparedStatement ps=null;
        Connection connection=null;
        ResultSet rs =null;
        FileOutputStream fos=null;
        FileInputStream fis=null;
        File file=null;

        String url = "jdbc:mysql://localhost:3306/img";
        String user = "root";
        String pass = "Udk@3654";
        try {

             connection = DriverManager.getConnection(url, user, pass);
             if (connection!=null){
            System.out.println(connection.getClass());
             file = new File("C:\\img.jpg");
             fis = new FileInputStream(file);
             ps = connection.prepareStatement("insert into img1 (img_name,img) values(?,?)");
            ps.setString(1, "img");
            ps.setBinaryStream(2, fis, (int) file.length());
            ps.executeUpdate();
                 fis.close();
                 ps.close();
            System.out.println("insert image complete::");


            }
             try {
                 System.out.println("retrieving image start");
                 fos = new FileOutputStream(file);
                 byte b[];
                 Blob blob;
                 ps = connection.prepareStatement("select * from img1");
                 rs = ps.executeQuery();
                 while (rs.next()) {
                     blob = rs.getBlob("image");
                     b = blob.getBytes(1, (int) blob.length());
                     fos.write(b);
                 }
             } catch (SQLException | IOException throwables) {
                 throwables.printStackTrace();
             }


        } catch (Exception es) {
            es.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (fos != null) {
                    fos.close();
                }
                if (connection != null) {
                    connection.close();
                }


            } catch (SQLException throwables) {
                throwables.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}

