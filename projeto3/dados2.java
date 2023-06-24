import java.util.*;

import java.text.*;

public class aula2Aumentosalarial {

public static void main(String[] args) {

// declaração das variáveis

float salario;

float virAumento;

float novosal;

// entrada dos dados

Scanner leia;

leia= new Scanner(System.in);

System.out.print("Digite o Salário: ");

System.out.print("Digite o Valor do Aumento: ");

virAumento = leia.nextFloat();

salario leia.nextFloat();

// cálculos

novosal = salario + vir Aumento;

// Saída de dados

System.out.println("Novo salário: " + novosal);

// Exemplo da saída de dados utilizando formatação de casas decimais

Decimal Format decimal; /* declaração da variável DECIMAL para ser

utilizada na classe DecimalFormat */

/* abaixo, inicialização da variável DECIMAL com formatação para

• Impressão de números reais com

duas casas decimais e separador de milhar. */

decimal = new DecimalFormat("#,##0.00");

System.out.print("Novo salário: " + decimal. format (novosal) );

lela.close();
}