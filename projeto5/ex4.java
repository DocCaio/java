public class Exemplo4 {

public static void main(String Args[]) {

int valor;

Scanner leia= new Scanner (System.in);

System.out.print ("Digite um valor inteiro para o fatorial:");

valor leia.nextInt ();

System.out.println("o fatorial de " + valor + "é":"fatorial (valor));

}

public static long fatorial (int n) {

long fat;

int i;

fat = 1;

for (i = 1; i <= n ; i++) {

fat fat * i;

}

return fat;

}

}