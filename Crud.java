import java.sql.*;

public class Crud {
    public static <Int> void main(String[] args) {


        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
            String sql = "SELECT * FROM students";
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);

//            printing table data
            System.out.println("id "+" name "+"age ");
            while (result.next()) {
                int id = result.getInt(1);
                String name = result.getString("name");
                int age = Integer.parseInt(result.getString(3));
                System.out.println(id+" "+name+" "+age);
            }

//            CREATE
//            String sql1 = "insert into students (id, name,age) values (?, ?, ?)";
//            PreparedStatement statement1 = connection.prepareStatement(sql1);
//            statement1.setInt(1, 2);
//            statement1.setString(2, "baskey");
//            statement1.setInt(3, 15);
//            statement1.executeUpdate();

//         INSERT
//            String sql2 = "insert into students (id, name,age) values (?, ?, ?)";
//            PreparedStatement statement2 = connection.prepareStatement(sql2);
//            statement2.setInt(1, 3);
//            statement2.setString(2, "Rahul");
//            statement2.setInt(3, 15);
//            statement2.executeUpdate();


//            DELETE
//            String sql3= "DELETE FROM students WHERE id=?";
//            PreparedStatement statement3 = connection.prepareStatement(sql3);
//            statement3.setInt(1, 1);
//            statement3.executeUpdate();

//              UPDATE
//            String sql4= "update students set name=? where name=?";
//            PreparedStatement statement4 = connection.prepareStatement(sql4);
//            statement4.setString(1, "sagar");
//            statement4.setString(2, "baskey");
//            statement4.executeUpdate();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}