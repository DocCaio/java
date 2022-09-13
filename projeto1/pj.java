import java.util.Scanner;

public class AtividadeDiscursiva5Grupo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Variáveis
		int contAlunos = 0, codigoCurso, codigoAluno, cargaHorariaTotal = 0;
		char cadastrar;
		boolean pararExecucao = false;
		Scanner leia = new Scanner(System.in);		

		System.out.println("Informe o código do aluno:"); 
		codigoAluno = leia.nextInt();
		
		//Execução
		do {
		System.out.println("Código: 1 Curso:Introdução ao PHP Carga Horária: 10"); 
		System.out.println("Código: 2 Curso: Script SHELL Carga Horária: 7"); 
		System.out.println("Código: 3 Curso: Windows 10 e a segurança Carga Horária: 3"); 
		System.out.println("Código: 4 Curso: Firewall, os segredos! Carga Horária: 4"); 
		System.out.println("Código: 5 Curso: Desvendando o MySQL Carga Horária: 4"); 
		System.out.println("Código: 6 Curso: Android VS IOS Carga Horária: 2"); 
		
			
		System.out.println("Digite o código do curso:"); 
		codigoCurso = leia.nextInt();
		
		if(codigoCurso == 1)
		{
			cargaHorariaTotal = cargaHorariaTotal + 10;
			//incrementar o curso 1
		}
		if(codigoCurso == 2)
		{
			cargaHorariaTotal = cargaHorariaTotal + 7;
			//incrementar o curso 2
		}
		if(codigoCurso == 3)
		{
			cargaHorariaTotal = cargaHorariaTotal + 3;
			//incrementar o curso 3
		}
		if(codigoCurso == 4)
		{
			cargaHorariaTotal = cargaHorariaTotal + 4;
			//incrementar o curso 4
		}
		if(codigoCurso == 5)
		{
			cargaHorariaTotal = cargaHorariaTotal + 4;
			//incrementar o curso 5
		}
		if(codigoCurso == 6)
		{
			cargaHorariaTotal = cargaHorariaTotal + 2;
			//incrementar o curso 6
		}

		contAlunos++;
		
		System.out.println("Deseja cadastrar mais cursos?"); 
		System.out.println("S ou N"); 
		cadastrar = leia.next().charAt(0); //leitura de caractere
		
		if(cadastrar == 0 && cargaHorariaTotal < 12)
		{
			System.out.println("A carga horária mínima é de 12 hrs, favor completar o cadastro!");
			pararExecucao = false;
		}
		else if(cadastrar == 0 && cargaHorariaTotal >= 12)
		{
			pararExecucao = true;
		}
		
		//Verifica se a quantidade de alunos é maior que 60; se true, não pode mais cadastrar
		if(contAlunos >= 60)
		{
			pararExecucao = true;
		}
			
		//Imprimir aqui o relatório parcial, apresentando o código do aluno em questão e a carga horária obtida até aqui
		
		}while(pararExecucao == false);//interrompe o laço 
		
		//Imprimir aqui o relatório final, apresentando a quantidade de cadastros para cada curso
	}
} 
if(cadastrar == 'N' && cargaHorariaTotal < 12)
		{
			System.out.println("A carga horária mínima é de 12 hrs, favor completar o cadastro!");
			pararExecucao = false;
		}
		else if(cadastrar  == 'N' && cargaHorariaTotal >= 12)
		{
			pararExecucao = true;
		}
 
						
 
				

	




