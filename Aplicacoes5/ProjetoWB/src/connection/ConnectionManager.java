package connection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

	private static Connection connection = null;

	public ConnectionManager() {
		super();

		ConnectionConfig connectionConfig = new ConnectionConfig();
		connectionConfig.setDriver("com.mysql.jdbc.Driver");
// Casa
		connectionConfig.setDatabase("/LTPIII");
		connectionConfig.setUri("jdbc:mysql://localhost");
		connectionConfig.setUser("aluno");
		connectionConfig.setPassword("123");

/*//Fumec		
		connectionConfig.setDatabase("/LTPIII");
		connectionConfig.setUri("jdbc:mysql://hanna");
		connectionConfig.setUser("ugo");
		connectionConfig.setPassword("123456");
*/		
		
		try {

			Class.forName(connectionConfig.getDriver());
			connection = (Connection)DriverManager.getConnection(connectionConfig.getUri() + 
																 connectionConfig.getDatabase(),
																 connectionConfig.getUser(),
																 connectionConfig.getPassword());			
		} catch (SQLException e) {
			System.err.println("Erro ao criar conex�o in ConnectionManager");
			e.printStackTrace();			
		} catch (ClassNotFoundException e) {
			System.err.println("Erro ao criar conex�o in ConnectionManager - Classe n�o encontrada");
			e.printStackTrace();						
		}
	}

	public static Connection getMysqlConnection() throws SQLException {
    	
		ConnectionManager connectionManager = null;
		
		if (connection == null) 
    		connectionManager = new ConnectionManager();
    	
    	return connection;
    }

}
