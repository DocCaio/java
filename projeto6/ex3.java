 #include <stdio.h>

 void troca(int a, int *b){

 int temp = a;
 a=*b;

*b = temp;

 }



 int main(void) {

 int a = 12,

b=9;


 troca(a, &b);

 printf("\nA = %d , a , B =
 return 0;

}