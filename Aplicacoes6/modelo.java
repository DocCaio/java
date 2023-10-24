package e1;

import java.util.Scanner;

public class a {
	
	public static void main(String [] args){
		System.out.println ("quantas pessoas serao cadastradas");
		Scanner sc = new Scanner (System.in);
		int pessoas = sc.nextInt();
		System.out.println("quantos produtos serao cadastrados");
		int produtos = sc.nextInt();
		int menu = 0;
		String nome[]=new String[pessoas];
		String codigo[]=new String[pessoas];
		String nomeProduto[]=new String[produtos];
		String codigoProduto[]=new String[produtos];
		float valorProduto[]=new  float[produtos];
		String nomeCliente[]=new String[300];
		String nomeProduto2[]=new String[300];
		int qntProdutos[]=new int[300];
		float valorTotal[]=new float[300];
		float totalFaturado = 0 ;
		do {
			System.out.println ("|0| SAÍDA");
			System.out.println ("|1| CADASTROS");
			System.out.println ("|2| LISTAGEM");
			System.out.println ("|3| VENDAS");
			System.out.println ("|4| RELATÓRIOS");
			System.out.println ("|5| CONCISTENCIA");
			System.out.println ("ESCOLHA UM MENU");
			menu = sc.nextInt();
			
			switch(menu){
			case 1:
				System.out.println("cadastro de pessoas:");
				for	(int i=0;i<pessoas;i++){					
					System.out.println("digite o nome:");
					nome[i]=sc.next();
					System.out.println("digite o codigo:");
					codigo[i]=sc.next();
					
								
					
				}
				for (int j=0;j<produtos;j++){
					System.out.println ("digite o nome do produto");
					nomeProduto[j]=sc.next();
					System.out.println ("didite o codigo do produto");
					codigoProduto[j]=sc.next();
					System.out.println ("digite o valor do produto");
					valorProduto[j]=sc.nextFloat();
					
				}
				break;
			case 2:
				for (int i=0;i<pessoas;i++){
					System.out.println(codigo[i] + "-" + nome[i]);
					
				}
				for (int j=0;j<produtos;j++){
					System.out.println(codigoProduto[j] + "-" + nomeProduto[j] + "(R$" + valorProduto[j] + ")");
				}
				break;
			case 3:
				for (int i=0;i<nomeCliente.length;i++){
					System.out.println("digite o nome do cliente");
					nomeCliente[i]=sc.next();
					System.out.println("digite o nome do produto");
					nomeProduto2[i]=sc.next();
					System.out.println("digite a quantidade do produto");
					qntProdutos[i]=sc.nextInt();
					System.out.println("digite o valor total");
					valorTotal[i]=sc.nextFloat();
					totalFaturado += valorTotal[i];
				}
				break;
			case 4:
				for (int i=0;i<qntProdutos.length;i++){
					System.out.println(qntProdutos[i] + "-" + nomeProduto[i]);
					
				}
				System.out.println("total faturado:" + totalFaturado);
				break;
			}
			
			
		}while(menu!=0);
		
		
		
		
		
		
	}

}

