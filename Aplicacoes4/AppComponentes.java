import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AppComponentes {

	public static void main(String[] args) {

		JLabel label = new JLabel("Label");
		label.setBounds(20,10,100,20);

		JTextField textField = new JTextField();
		textField.setBounds(20,40,100,20);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(20,70,200,50);

		JCheckBox checkBox = new JCheckBox("CheckBox");
		checkBox.setBounds(20,130,100,20);

		JRadioButton radioButton = new JRadioButton("RadioButton");
		radioButton.setBounds(20,160,100,20);

		JButton botao = new JButton("Botao");
		botao.setBounds(20,190,100,30);

		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(20,230,100,20);
		comboBox.addItem("Item 1");
		comboBox.addItem("Item 2");
		comboBox.addItem("Item 3");

		JFrame janela = new JFrame("LTPIII");
		janela.setLayout(null);
		janela.setSize(300, 500);
		janela.add(label);
		janela.add(textField);
		janela.add(textArea);
		janela.add(checkBox);
		janela.add(radioButton);
		janela.add(botao);
		janela.add(comboBox);
		janela.setVisible(true);
	}

}
