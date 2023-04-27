import java.sql.*;

public class Application {
    public static void main(String[] args) throws SQLException {
        final String user = "postgres";
        final String password = "2908Sherlok";
        final String url = "jdbc:postgresql://localhost:5432/skypro";

        try (final Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement("SELECT * FROM employees WHERE id = (?)")) {
            statement.setInt(1, 1);
            final ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                String first_name = "Имя: " + resultSet.getString("first_name");
                String last_name = "last_name: " + resultSet.getString("last_name");
                String gender = "gender: " + resultSet.getString(4);
                int age = resultSet.getInt(5);


                System.out.println(first_name);
                System.out.println(last_name);
                System.out.println(gender);
                System.out.println("Age:" + age);


            }
        }
    }
}
