public class FuncionarioAula3 {

	private int numRegistro;
	private String nome;
	private String endereco;
	private char sexo;
	private float salarioBase;

	public FuncionarioAula3() {
		super();
	}

	public FuncionarioAula3(int numRegistro, String nome, String endereco, char sexo, float salario) {
		super();
		this.numRegistro = numRegistro;
		this.nome = nome;
		this.endereco = endereco;
		this.sexo = sexo;
		this.salarioBase = salario;
	}

	public int getNumRegistro() {
		return numRegistro;
	}
	public void setNumRegistro(int numRegistro) {
		this.numRegistro = numRegistro;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public float getSalario() {
		return salarioBase;
	}
	public void setSalario(float salario) {
		this.salarioBase = salario;
	}

	@Override
	public String toString() {
		return "\nFuncionario [numRegistro=" + numRegistro + ", nome=" + nome + ", endereco=" + endereco + ", sexo="
				+ sexo + ", salario=" + salarioBase + "]";
	}
	
}