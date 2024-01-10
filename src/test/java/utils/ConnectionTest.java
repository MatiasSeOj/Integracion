package utils;

import java.sql.Connection;
import java.sql.DriverManager;

import org.testng.annotations.Test;

public class ConnectionTest {
	Connection con;
  @Test
  public void f() {
	  try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", "root", "");
			System.out.print("DataBase is connected");
		} catch(Exception e) { System.out.print(e); }
  }
}
