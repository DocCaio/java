import javax.swing.JButton;
import javax.swing.JFrame;

public class AppFrame {

	public static void main(String[] args) {

		JButton botao1 = new JButton("Primeiro botão");		
		JButton botao2 = new JButton("Segundo botão");
		
		botao1.setBounds(70, 20, 140, 30);
		botao2.setBounds(70, 70, 140, 30);
		
		JFrame janela = new JFrame("LTPIII");
		janela.setLayout(null);
		janela.setSize(300, 200);
		janela.add(botao1);
		janela.add(botao2);
		janela.setVisible(true);
	}

}
