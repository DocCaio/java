
public class Funcionario_v1 {

	private int codigo;
	private String nome;
	private float salarioBase;
	
	public void concederAdiantamento(float valor){
		//implementa��o qualquer
	}

	public void atribuirDesconto(float valor){
		//implementa��o qualquer
	}
	
	public float calcularSalarioDiretor() {
		return 1000;
	};

	public float calcularSalarioGerente() {
		return 2000;
	};

	public float calcularSalarioAssistente() {
		return 3000;
	};
	
	public void gerarBonificacaoDiretor(float bonus) {
		//implementa��o de bonifica��o para diretores		
	};	

	public void gerarBonificacaoGerente(float bonus) {
		//implementa��o de bonifica��o para gerentes
	};	
	
	public void gerarBonificacaoAssistente(float bonus) {
		//implementa��o de bonifica��o para assistentes		
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
	
}
