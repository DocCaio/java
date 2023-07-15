package interfaces.animal;

public interface Animal {
	
	public final int atributo1 = 10; 
	
	public void eat();
	public void travel();
	
	public static void dormir(){
		System.out.println("O animal agora está dormindo");
	}
	
	public default void descansar(){
		System.out.println("O animal agora está descansando");		
	}
	
}
