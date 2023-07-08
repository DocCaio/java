public class StudentPoll 
{
   public static void main(String[] args)
   {
      int[] respostas = {1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2};
      int[] frequencia = new int[6];

      for (int i = 0; i < respostas.length; i++)
      {
    	if (respostas[i] == 1)
    		frequencia[1] += 1;
    	else if (respostas[i] == 2)
    		frequencia[2] += 1;
    	else if (respostas[i] == 3)
    		frequencia[3] += 1;
    	else if (respostas[i] == 4)
    		frequencia[4] += 1;
    	else if (respostas[i] == 5)
    		frequencia[5] += 1;
      } 

      System.out.println("Resposta" + " - " + "Frequência");
   
      for (int i = 1; i < frequencia.length; i++)
         System.out.println(i + "        - " + frequencia[i]);
   } 
}