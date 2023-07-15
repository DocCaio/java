import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Excluir {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Connection connection;
		PreparedStatement stmt = null;
		
		/*		
		// versão do MySql com o Driver mysql-connector-java-5.1.40-bin.jar
		Class.forName("com.mysql.jdbc.Driver");
		connection = (Connection)DriverManager.getConnection
				("jdbc:mysql://localhost/LTPIII","professor","123456");
		*/

		// versão do MySql com o Driver mysql-connector-java-8.0.12.jar
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection = DriverManager.getConnection(
				"jdbc:mysql://localhost/LTPIII?useTimezone=true&serverTimezone=UTC",
				"professor","123456");			

		String sql = "DELETE FROM empresa WHERE Codigo=3";
		stmt = connection.prepareStatement(sql);
		stmt.executeUpdate();
		
	}

}

