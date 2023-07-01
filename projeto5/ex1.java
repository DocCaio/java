import java.util.*;

public class Exemplo1 {

static int x,y; // variáveis globais para todas as classes de Exemplo1

public static void main(String Args[]) {

x = 5;

y = 10;

subtrai ();

System.out.println("Valor de X:" + x);

System.out.println("Valor de Y:" + y);

}

public static void subtrai () {

x = x - 2;

y = y - 1;

}

}