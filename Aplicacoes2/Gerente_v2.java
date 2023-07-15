
public class Gerente_v2 extends Funcionario_v2 {

	@Override
	public float calcularSalario(){
		return this.getSalarioBase() * 1.5f;
	}

	@Override
	public void gerarBonificacao(float bonus){
		this.setSalarioBase(this.getSalarioBase() + bonus);		
	}

}
