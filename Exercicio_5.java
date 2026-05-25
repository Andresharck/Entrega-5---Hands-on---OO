import java.util.LinkedList;
import java.util.Queue;

public class Exercicio_5 {

    public static void main(String[] args) {

        
        Queue<String> fila = new LinkedList<>();

        
        fila.add("Ana");
        fila.add("Bruno");
        fila.add("Carlos");
        fila.add("Maria");
        fila.add("João");

       
        System.out.println("Fila de clientes:");
        System.out.println(fila);

     
        System.out.println("\nPróximo cliente:");
        System.out.println(fila.peek());

       
        System.out.println("\nAtendendo clientes...");
        System.out.println("Cliente atendido: " + fila.poll());
        System.out.println("Cliente atendido: " + fila.poll());

       
        System.out.println("\nFila atualizada:");
        System.out.println(fila);
    }
}
