
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpresaDAO {

	private Connection connection = null;
	private PreparedStatement stmt = null;
	private ResultSet rs = null;

	public EmpresaDAO() throws ClassNotFoundException{
		try {
			/*		
			// versão do MySql com o Driver mysql-connector-java-5.1.40-bin.jar
			Class.forName("com.mysql.jdbc.Driver");
			this.connection = (Connection)DriverManager.getConnection
					("jdbc:mysql://localhost/LTPIII","professor","123456");
			*/

			// versão do MySql com o Driver mysql-connector-java-8.0.12.jar
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.connection = DriverManager.getConnection(
					"jdbc:mysql://localhost/LTPIII?useTimezone=true&serverTimezone=UTC",
					"professor","123456");			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public ResultSet findByCodigo( int codigo ) {

		String sql = "select codigo, nome, endereco, telefone from EMPRESA where codigo = ?";

		try {
			this.stmt = this.connection.prepareStatement(sql);
			this.stmt.setInt(1, codigo);
			rs = stmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	public ResultSet findAll() {

		String sql = "select codigo, nome, endereco, telefone from EMPRESA order by codigo";

		try {
			this.stmt = this.connection.prepareStatement(sql);
			rs = stmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}

	public void excluir(Empresa empresa) {		
		String sql = "delete from EMPRESA where codigo = ?";
		try {
			this.stmt = connection.prepareStatement(sql);
			this.stmt.setInt(1, empresa.getCodigo() );
			this.stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
	
	public void inserir(Empresa empresa){
		
		String sql = "insert into EMPRESA(codigo, nome, endereco, telefone) values (?, ?, ?, ?)";
		
		try {
			
			this.stmt = connection.prepareStatement(sql);
			this.stmt.setInt(1, empresa.getCodigo());
			this.stmt.setString(2, empresa.getNome());
			this.stmt.setString(3, empresa.getEndereco());
			this.stmt.setString(4, empresa.getTelefone());
			this.stmt.executeUpdate();			
		} catch (SQLException e) {
			System.out.println("Erro: " + e.getMessage());
			e.printStackTrace();
		}
	}

	public void alterar(Empresa empresa){
		
		String sql = "update EMPRESA set nome = ?, endereco = ?, telefone = ? where codigo = ?";
		
		try {
			
			this.stmt = connection.prepareStatement(sql);
			this.stmt.setString(1, empresa.getNome());
			this.stmt.setString(2, empresa.getEndereco());
			this.stmt.setString(3, empresa.getTelefone());
			this.stmt.setInt(4, empresa.getCodigo());
			this.stmt.executeUpdate();			
		} catch (SQLException e) {
			System.out.println("Erro: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
}
