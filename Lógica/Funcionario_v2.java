
public class Funcionario_v2 {

	private int codigo;
	private String nome;
	private float salarioBase;
	
	public void concederAdiantamento(float valor){
		//implementação qualquer
	}

	public void atribuirDesconto(float valor){
		//implementação qualquer
	}
	
	public float calcularSalario() {
		return 0;
	};
	
	public void gerarBonificacao(float bonus) {
		//implementação de bonificação para funcionário genérico		
	};	

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	@Override
	public String toString() {
		return "\nFuncionario_v2 [codigo=" + codigo + ", nome=" + nome + ", salarioBase=" + salarioBase + "]";
	}	
	
}
