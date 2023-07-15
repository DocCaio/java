import java.sql.ResultSet;
import java.sql.SQLException;

public class AppDAO {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Empresa empresa = new Empresa();
		empresa.setCodigo(11);
		empresa.setNome("Empresa criada pelo DAO");
		empresa.setEndereco("Endereço da empresa criada pelo DAO");
		empresa.setTelefone("4444-4444");

		EmpresaDAO empresaDAO = new EmpresaDAO();
		empresaDAO.inserir(empresa);
		
		ResultSet rs = empresaDAO.findAll();
		int i = 1;
		while (rs.next()) {
			System.out.println("Empresa " + i);
			System.out.println( "Código: " + rs.getInt("Codigo") );
			System.out.println( "Nome: " + rs.getString("Nome") );
			System.out.println( "Endereco: " + rs.getString("Endereco") );
			System.out.println( "Telefone: " + rs.getString("Telefone") );
			i++;
		}		
	}
}

