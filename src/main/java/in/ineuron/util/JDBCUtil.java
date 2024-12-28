package in.ineuron.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {
	private JDBCUtil() {

	}

	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() throws SQLException {

		String url = "jdbc:mysql:///webprojects";
		String user = "root";
		String pass = "root";

		Connection connection = DriverManager.getConnection(url, user, pass);

		return connection;

	}
}
