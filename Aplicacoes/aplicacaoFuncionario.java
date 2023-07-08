import java.util.ArrayList;

public class aplicacaoFuncionario {
		
	public static void main(String[] args)
    {

		FuncionarioAula3 funcionario1 = new FuncionarioAula3(123,"Funcionário Silva","Rua X 500 Apto 201",'M',3000);
		FuncionarioAula3 funcionario2 = new FuncionarioAula3(254,"Funcionário Smith","Rua Y 300",'M',2000);
		FuncionarioAula3 funcionario3 = new FuncionarioAula3(621,"Funcionário Jonh","Rua Alfa 1100",'M',7000);
		FuncionarioAula3 funcionario4 = new FuncionarioAula3(297,"Funcionária Mel","Rua Beta 003 Bloco B",'F',5240.37f);

		ArrayList<FuncionarioAula3> funcionarios = new ArrayList<FuncionarioAula3>(); 
		
		funcionarios.add(funcionario1);
		funcionarios.add(funcionario2);
		funcionarios.add(funcionario3);
		funcionarios.add(funcionario4);
		
		System.out.println(funcionarios.size());
		System.out.println(funcionarios);
		System.out.println("funcionarios.get(1): " + funcionarios.get(1));		
		System.out.println(funcionarios.indexOf(funcionario3));
		funcionarios.remove(funcionario3);
		System.out.println(funcionarios.size());
		System.out.println(funcionarios);
    }
}
