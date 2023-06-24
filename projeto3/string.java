string textos

double numeros

Scanner leia-new Scanner(System.in)

System.out.print("Digite o texto com caracteres nimerico: ");

texto leia.nextLine()

try {

numero - Double.parzedouble(texto);

System.out.print (numero);

// será exibido o número digitado

na entrada de dados

} catch (NumberFormatException)

System.out.print("o texto digitado não pode ser convertido em número ! ");