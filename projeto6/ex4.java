#include <stdio.h>

void funcao(int *valori, int valor2);

int main ()
{
int valor1 = 4 ,
valor2 = 34;

funcao(&valor1, valor2);
printf("\nValor 1 = %d e Valor 2 = %d", valorl, valor2);

return O;

}

void funcao(int *valoril, int valor2) {
*valor1 = *valor1 * 2; //É o mesmo que escrever *valor1 *= 2;
valor2 = valor2 - 100; //É o mesmo que escrever valor2 100;
printf("/nValor 1 = %d e Valor 2 = %d", *valor1, valor2);

}