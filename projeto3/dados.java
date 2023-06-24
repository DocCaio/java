import java.util.*;

public class ExemploEntrada {

public static void main(String[] args) {

// declaração das variáveis

String nome;

char sexo;

float salario;

byte idade;

// entrada dos dados

Scanner leia;

leia= new Scanner (System.in);

// declara a variável leia para ser utilizada na classe Scanner

/* inicializa a variável leia para receber os

valores de entrada da classe Scanner */

System.out.print("Digite o Nome: ");

nome leia.nextLine();

System.out.print ("Digite o Salario: ");

salario leia.nextFloat(); // recebe o valor digitado e armazena na var. SALARIO

System.out.print ("Digite a Idade: ");

idade = leia.nextByte();

System.out.print ("Digite o Sexo: ");

// recebe o valor digitado e armazena na variável NOME

// recebe o valor digitado e armazena na variável IDADE

sexo = leia.next().charAt(0); //recebe o valor digitado e armazena na var, sexo

// Saida de dados

System.out.println("O nome digitado foi: " + nome);

System.out.println("O salario digitado foi: " + salario);

System.out.println("A idade digitada foi: " + idade);

System.out.println("o sexo digitado foi: " + sexo);

}

}
