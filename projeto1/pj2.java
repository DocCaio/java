<script>
package carrosDesconto ;    
import java.util.*;  
public class Carros_Descontos {  
    public static void main( String[ ] args ) {  
  
        float descontoAno = 0;
        float valorVeiculo; 
        float descontoIdade =0;
        float descontoIdade2 =0;
        float valorFinalVeiculo =0;
        int idadeComprador, anoVeiculo; 
        
            Scanner leia = new Scanner( System.in ) ; 
            
            System.out.println( "Idade" ) ;  
            idadeComprador = leia.nextInt( ) ;            
            System.out.println( "Ano" ) ;  
            anoVeiculo = leia.nextInt( ) ;            
            System.out.println( "Valor" ) ;  
            valorVeiculo = leia.nextFloat( ) ;
  
            if ( anoVeiculo <= 2000 )               
            {   descontoAno = (float)(0.12*valorVeiculo);                
                  
            } else if (anoVeiculo > 2000 && anoVeiculo <= 2010)              
            { descontoAno = (float)(0.07*valorVeiculo); 
           
            } else if (anoVeiculo > 2010 && anoVeiculo <= 2014)             
            { descontoAno = (float)(0.03*valorVeiculo); 
            }  
            
            
            if (idadeComprador <= 40)
            {   descontoIdade =  (valorVeiculo - descontoAno);
                descontoIdade2 = (float)(descontoIdade*0.005);
                
            } else if (idadeComprador > 41 && idadeComprador <= 60)              
    {   descontoIdade =  (valorVeiculo - descontoAno);
            descontoIdade2 = (float)(descontoIdade*0.01);
            
    } else if (idadeComprador > 61)              
    {   descontoIdade =  (valorVeiculo - descontoAno);
    descontoIdade2 = (float)(descontoIdade*0.02);
    }
            valorFinalVeiculo = (valorVeiculo - descontoAno - descontoIdade2);
            
            System.out.println("O desconto ano do veículo" + descontoAno);
            System.out.println("O desconto pela idade" + descontoIdade2);
            System.out.println("Valor final" + valorFinalVeiculo );
        
           leia.close(); 
    }
    
}



</script>


