package model;

import java.sql.Connection;
import java.sql.DriverManager;

	public class Conexao {
		
		private static final String USERNAME = "root";

		private static final String PASSWORD = "b3h4ppy";
	
		private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/conectamais";
		
	public static Connection createConnectionToMySQL() throws Exception {
			
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection(DATABASE_URL,USERNAME, PASSWORD);
		return connection;
		
		}
}

