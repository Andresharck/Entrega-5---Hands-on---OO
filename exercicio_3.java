import java.util.HashSet;
public class exercicio_3 {
    public static void main(String[] args) {
        HashSet<String> nomes= new HashSet<>();
        nomes.add("Gabriel ");
        nomes.add("Ronaldo ");
        nomes.add("Gabriel ");
        nomes.add("André  ");
        nomes.add("Irmão do jorel ");
        System.out.println(nomes);
      System.out.println("Quantidade de alunos = "+ nomes.size());
        

    }
    
}
