
public class Assistente_v2 extends Funcionario_v2 {

	@Override
	public float calcularSalario(){
		return this.getSalarioBase();
	}

	@Override
	public void gerarBonificacao(float bonus){
		this.setSalarioBase(this.getSalarioBase() + bonus);		
	}
	
}
