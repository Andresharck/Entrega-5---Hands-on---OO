import java.util.ArrayList;

public class Exercicio_2 {
    public static void main(String[] args) {
        ArrayList<Double> notas = new ArrayList<>();

        notas.add(8.5);
        notas.add(7.0);
        notas.add(6.5);
        notas.add(9.0);
        notas.add(10.0);

        double soma = 0;

        for (double nota : notas) {
            soma += nota;
        }
        double media = soma / notas.size();
        System.out.println("Media : " + media);

        if (media>= 7) {
            System.out.println("A media da turma foi maior que 7 ");

            
        }
        else{
            System.out.println("A media da turma foi menor que 7 ");
        }
    }

}
