import java.util.ArrayList;

public class ArrayListDemo {

   public static void main(String args[]) {

	  ArrayList al = new ArrayList();
      System.out.println("Tamaho inicial do ArrayList: " + al.size());

      al.add("C");
      al.add("A");
      al.add("E");
      al.add("B");
      al.add("D");
      al.add("F");
      System.out.println("Conte�do do ArrayList: " + al);
      al.add(1, "A1");
      al.set(2, "A2");
      System.out.println("Tamano do ArrayList ap�s os elementos serem adicionados: " + al.size());

      System.out.println("Conte�do do ArrayList: " + al);

      al.remove("F");
      al.remove(2);
      al.set(1, "A");
      System.out.println("Tamano do ArrayList ap�s exclus�es: " + al.size());
      System.out.println("Conte�do do ArrayList: " + al);
   }
}