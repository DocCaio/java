public class Combatente {
        
    private static int numeroDeCombatentes = 0;
    private String nomeCombatente;	    
    private final String pelotaoCombatente;

	public Combatente(String nomeCombatente, String pelotaoCombatente){
        this.nomeCombatente = nomeCombatente;
        this.pelotaoCombatente = pelotaoCombatente;
    	numeroDeCombatentes += 1;
    }
	
    public void atacar() {
        if (numeroDeCombatentes > 4) 
        	System.out.println("Ataque realizado combatente " + nomeCombatente); 
        else
        	System.out.println("Ataque cancelado. Combatente " + nomeCombatente + 
        			", busque mais reforços antes de atacar. Você tem apenas " + 
        			numeroDeCombatentes + " aliados no momento.");
    }

}