import javax.swing.JOptionPane;

public class AppJOptionPane {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Texto da mensagem");
		
		JOptionPane.showMessageDialog(null, "Texto da mensagem", "T�tulo da mensagem", JOptionPane.INFORMATION_MESSAGE);

		JOptionPane.showInputDialog(null, "Texto da mensagem");
		
		JOptionPane.showInputDialog(null, "Texto da mensagem", "T�tulo da mensagem", JOptionPane.QUESTION_MESSAGE);
		
		String nome = JOptionPane.showInputDialog(null, "Qual o seu nome?", "T�tulo da mensagem", JOptionPane.QUESTION_MESSAGE);
		
		JOptionPane.showMessageDialog(null, nome, "Nome digitado", JOptionPane.INFORMATION_MESSAGE);

		JOptionPane.showConfirmDialog(null, "teste"); 
	}

}
