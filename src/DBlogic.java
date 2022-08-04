import java.sql.*;

public class DBlogic {

    String DB = "jdbc:mysql://localhost:3306/0208_crudjava";
    String USER = "root";
    String PASS = "passpass";

    // insert
    public void insert() {
        try (
                Connection conn = DriverManager.getConnection(DB, USER, PASS);
                Statement stmt = conn.createStatement();
        ) {

            PreparedStatement ps = conn.prepareStatement("INSERT INTO users (user, name) VALUES (?, ?)");
            ps.setString(1, "Coding");
            ps.setString(2, "school");

            ps.executeUpdate();

            System.out.println("dati pievienoti");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
// Delete method
    public void delete() {

        try {

            Connection conn = DriverManager.getConnection(DB, USER, PASS);
            Statement stmt = conn.createStatement();

            PreparedStatement ps = conn.prepareStatement("DELETE FROM users WHERE user =?");


            ps.setString(1, "hei");

            ps.executeUpdate();
            System.out.println("dati ir izdzesti");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
