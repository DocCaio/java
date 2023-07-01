import java.util.*;

public class PesquisaSequencialEmVetor {

public static void main(String[] args) {

String nome Pesquisa;

String nomes [] = new String [5];

}

}

int x;

boolean encontrou;

Scanner leia = new Scanner(System.in);

for (x = 0; x <= 4 ; x++) {

}

do {

System.out.print("Digite o Nome " + X para armazenar no Vetor: ");

nomes [x] = leia.nextLine ();

System.out.print ("Digite o Nome para pesquisa (FIM para encerrar): ");

nome Pesquisa = leia.nextLine();

if ( nome Pesquisa.equals ("FIM")) {

break;

}

encontrou false;

for (x=0; x<= 4; x++) {

if ( nome Pesquisa.equals (nomes [x])) {

encontrou = true;

break;

}

}

if (encontrou) {

    System.out.println("Nome encontrado na posição + x + " do vetor!");

} else{


System.out.println("O Nome digitado NÃO FOI ENCONTRADO NO VETOR !");

}

}while (nomePesquisa != "FIM");

}

}