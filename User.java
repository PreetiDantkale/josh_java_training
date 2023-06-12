import java.sql.*;
public class User {
  public static void main(String args[]){
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javademo",
        "root","password");
      Statement stmt = connection.createStatement();
      stmt.executeUpdate("insert into users values(2,'Raj',50)");
      ResultSet set = stmt.executeQuery("select * from users");
      while(set.next()){
        System.out.println("Hello");
        System.out.println("ID: "+ set.getInt(1)+ " Name: " + set.getString(2)+ " Age: "+ set.getInt(3));
      }
    }
    catch(Exception e){
      System.out.println(e);
    }
  }
}
