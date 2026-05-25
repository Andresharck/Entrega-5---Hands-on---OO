import java.util.HashMap;

public class exercico_4 {
      public static void main(String[] args) {

        int matricula = 202;

        HashMap<Integer, String> aluno = new HashMap<>();

        aluno.put(201, "Ana");
        aluno.put(202, "Bruno");
        aluno.put(203, "Maria");

        
        System.out.println(aluno);

        
        System.out.println(aluno.get(201));

       
        if (aluno.containsKey(matricula)) {

            System.out.println("Aluno encontrado: " + aluno.get(matricula));

        } else {

            System.out.println("A matrícula " + matricula + " não existe no HashMap.");
        }
    }
}
