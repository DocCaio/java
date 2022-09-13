public class Empresa {
 
    private int numRegistro;
    private String nome;
    private String endereco;
    private char sexo;
    private float salarioBase;
    private String codugoEmpresa; 
    public Empresa() {
       super();
    }
    
    public Empresa(int numRegistro, String nome, String nome, String endereco char sexo, float salario) {
      super();
      this.numRegistro = numRegistro;
      this.nome = nome;
      this.endereco = endereco;
      this.sexo = sexo;
      this.salarioBase = salario;
     }
     
     public int getNumRegistro() {
        return numRegistro;
     }
     public void setNumRegistro(int numRegistro) {
          this.numRegistro = numRegistro;
     }
     public String getNome() {
          return nome;
     }
     public void setNome(String nome) {
         this.nome = nome;
     }
     public String getEndereco() {
        return endereco;
     }
     public void serEndereco(String endereco) {
         this.endereco = endereco;
     }
     public char getSexo() {
         return sexo;
     }
     public void setSexo(char sexo) {
        this.sexo = sexo;
     }
     public float getSalario(){
         return salarioBase;
     }
     public float getSalario( float salario) {
         this.salarioBase = salario;
     }
     
       @override
         public String toString() {
          return "\nFuncionario [numRegistro = " + numRegistro + " , nome = " , + nome + " , endereco = " + endereco + " , sexo = " ,
                   + sexo + " , salario = " + salarioBase + " ]";
         }
         
     }
     
     
     
         
 