MENU PRINCIPAL

package br.com.caio.sistemadevendas;

import br.com.caio.sistemadevendas.view.MenuPrincipal;

public class SistemaDeVendasMain {
    public static void main(String[] args) {
        
        MenuPrincipal m1 = new MenuPrincipal();
        m1.executar();
        
        
    }
    
}


package br.com.caio.sistemadevendas.dao;

import br.com.caio.sistemadevendas.entidade.Pessoa;

public class PessoaDao {
    public static Pessoa[]ps = new Pessoa[10];
    private static int cont = 0;
    
    public int inserir(Pessoa p){
        for (int i = 0; i < ps.length; i++) {
            if(ps[i]==null){
                ps[i] = p;
                p.setCodigo(cont+1);
                cont++;
                break;
            }
        }
        return cont;
    }
    
    public Pessoa consultar(int cod){
        Pessoa p = null;
        for (int i = 0; i < ps.length; i++) {
            if (ps[i].getCodigo()==cod) {
                p = ps[i];
                break;
            }
        }
        return p;
    }
    
    
}
package br.com.caio.sistemadevendas.dao;

import br.com.caio.sistemadevendas.entidade.Vendas;

public class VendasDao {
    
    public static Vendas[]vs = new Vendas[10];
    private static int cont = 0;
    
    public int inserir(Vendas v){
        for (int i = 0; i < vs.length; i++) {
            if(vs[i]==null){
                vs[i] = v;
                v.setCodigo(cont+1);
                cont++;
                break;
            }
        }
        return cont;
    }
    
    public Vendas consultar(int cod){
        Vendas v = null;
        for (int i = 0; i < vs.length; i++) {
            if (vs[i].getCodigo()==cod) {
                v = vs[i];
                break;
            }
        }
        return v;
    }
    
}












package br.com.caio.sistemadevendas.entidade;
public class Pessoa {
    
        private String CPF;
	private String nome;
        private int codigo;

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getSiglaEstado() {
        return siglaEstado;
    }

    public void setSiglaEstado(String siglaEstado) {
        this.siglaEstado = siglaEstado;
    }

    public long getCEP() {
        return CEP;
    }

    public void setCEP(long CEP) {
        this.CEP = CEP;
    }
	private int telefone;
	private String rua;
	private int numero;
	private String bairro;
	private String cidade;
	private String siglaEstado;
	private long CEP;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }
    
}
package br.com.caio.sistemadevendas.entidade;
public class Vendas {
    
    private String cpf;
    private String nomeCliente;
    private int idProduto;
    private String nomeProduto;
    private int codigo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    private int quantidade;
    private double valor;
    
}

package br.com.caio.sistemadevendas.view;

import java.util.Scanner;

public class MenuPrincipal {
    
    public void executar(){
        int menu = 0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("================================================");
            System.out.println("             Menu Principal");
            System.out.println("================================================");
            System.out.println("|0| PESSOAS");
            System.out.println("|1| VENDAS");
            System.out.println("|2| PRODUTOS");
            System.out.println("|3| SAIR");
            System.out.println("Digite uma opção: ");
            menu = sc.nextInt();
            if(menu < 0 || menu > 3){
                System.out.println("OPÇÃO INVÁLIDA");
            }else if (menu == 0){
                PessoaMenu sm = new PessoaMenu();
                sm.executar();
            }
            
        }while(menu != 3);
    }
    
    
}
package br.com.caio.sistemadevendas.view;

import br.com.caio.sistemadevendas.entidade.Pessoa;
import br.com.caio.sistemadevendas.dao.PessoaDao;
import java.util.Scanner;

public class PessoaCadastro {
    
    public void executar(){
        Pessoa p1 = new Pessoa();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--DADOS PESSOAIS--");
        System.out.println("CPF: ");
        p1.setCPF(sc.next());
        System.out.println("Nome: ");
        p1.setNome(sc.next());
        System.out.println("Telefone: ");
        p1.setTelefone(sc.nextInt());
        System.out.println("--ENDEREÇO--");
        System.out.println("Rua: ");
        p1.setRua(sc.next());
        System.out.println("Numero: ");
        p1.setNumero(sc.nextInt());
        System.out.println("Bairro: ");
        p1.setBairro(sc.next());
        System.out.println("Cidade: ");
        p1.setCidade(sc.next());
        System.out.println("Estado (Sigla): ");
        p1.setSiglaEstado(sc.next());
        System.out.println("CEP: ");
        p1.setCEP(sc.nextLong());
        
        PessoaDao pd = new PessoaDao();
        pd.inserir(p1);
    }

    
    
}

package br.com.caio.sistemadevendas.view;
import br.com.caio.sistemadevendas.dao.PessoaDao;
public class PessoaListar extends PessoaDao {
    public void executar(){
        for (int i = 0; i < 10; i++) {
            System.out.println(ps[i]);
        }
    }
    
}
package br.com.caio.sistemadevendas.view;

import java.util.Scanner;

public class PessoaMenu {

    public void executar() {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("===================");
        System.out.println("      SUB-MENU     ");
        System.out.println("===================");
        System.out.println("1 - CADASTRAR");
        System.out.println("2 - ALTERAR");
        System.out.println("3 - EXCLUIR");
        System.out.println("4 - LISTAR");
        System.out.println("5 - PESQUISAR");
        System.out.println("6 - RELATAR");
        System.out.println("7 - SAIR");
        i = sc.nextInt();
        if(i < 1 || i > 7){
            System.out.println("OPÇÃO INVÁLIDA");
        }else if(i == 1){
            PessoaCadastro p = new PessoaCadastro();
            p.executar();
        }else if(i == 4){
            PessoaListar p = new PessoaListar();
            p.executar();
        }

    }

}
package br.com.caio.sistemadevendas.view;

import br.com.caio.sistemadevendas.dao.VendasDao;
import br.com.caio.sistemadevendas.entidade.Vendas;
import java.util.Scanner;

public class VendasCadastro {
    public void executar(){
        Scanner sc = new Scanner(System.in);
        Vendas v1 = new Vendas();
        
        
        System.out.println("CPF: ");
        v1.setCpf(sc.next());
        System.out.println("Nome do Cliente: ");
        v1.setNomeCliente(sc.next());
        System.out.println("ID Produto: ");
        v1.setIdProduto(sc.nextInt());
        System.out.println("Nome do Produto: ");
        v1.setNomeProduto(sc.next());
        System.out.println("Quantidade: ");
        v1.setQuantidade(sc.nextInt());
        System.out.println("Valor: ");
        v1.setValor(sc.nextDouble());
        
        VendasDao vd = new VendasDao();
        vd.inserir(v1);
        
        
    }
    
}
package br.com.caio.sistemadevendas.view;
import br.com.caio.sistemadevendas.dao.VendasDao;
public class VendasListar extends VendasDao {
    
    public void executar(){
        for (int i = 0; i < 10; i++) {
            System.out.println(vs[i]);
        }
        
    }
    
}
package br.com.caio.sistemadevendas.view;

import java.util.Scanner;

public class VendasMenu {
    public void executar(){
        Scanner sc = new Scanner(System.in);
        int i;
        do{
            System.out.println("===================");
            System.out.println("      SUB-MENU     ");
            System.out.println("===================");
            System.out.println("1 - CADASTRAR");
            System.out.println("2 - ALTERAR");
            System.out.println("3 - EXCLUIR");
            System.out.println("4 - LISTAR");
            System.out.println("5 - PESQUISAR");
            System.out.println("6 - RELATAR");
            System.out.println("7 - SAIR");
            i = sc.nextInt();
            if(i < 1 || i > 7){
                System.out.println("OPÇÃO INVÁLIDA");
            }else if(i == 1){
                VendasCadastro v = new VendasCadastro();
                v.executar();
            }
        }while(i != 7);
    }
    
}
