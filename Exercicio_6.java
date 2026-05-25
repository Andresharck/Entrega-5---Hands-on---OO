import java.util.ArrayList;
import java.util.Scanner;

// Classe Livro
class Livro {

    int codigo;
    String titulo;
    String autor;
    boolean disponivel;

}

public class Exercicio_6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Livro> livros = new ArrayList<>();

        int opcao = 0;

        do {

            System.out.println("\n===== MENU =====");
            System.out.println("1 - Cadastrar livro");
            System.out.println("2 - Listar livros");
            System.out.println("3 - Emprestar livro");
            System.out.println("4 - Devolver livro");
            System.out.println("0 - Sair");

            System.out.print("Escolha uma opcao: ");
            opcao = sc.nextInt();

            sc.nextLine();

            // CADASTRAR LIVRO
            if (opcao == 1) {

                Livro l = new Livro();

                System.out.print("Digite o codigo: ");
                l.codigo = sc.nextInt();

                sc.nextLine();

                System.out.print("Digite o titulo: ");
                l.titulo = sc.nextLine();

                System.out.print("Digite o autor: ");
                l.autor = sc.nextLine();

                l.disponivel = true;

                livros.add(l);

                System.out.println("Livro cadastrado!");

            }

            // LISTAR LIVROS
            else if (opcao == 2) {

                if (livros.size() == 0) {

                    System.out.println("Nenhum livro cadastrado.");

                } else {

                    for (Livro l : livros) {

                        System.out.println("\nCodigo: " + l.codigo);
                        System.out.println("Titulo: " + l.titulo);
                        System.out.println("Autor: " + l.autor);

                        if (l.disponivel == true) {
                            System.out.println("Disponivel");
                        } else {
                            System.out.println("Indisponivel");
                        }
                    }
                }
            }

            // EMPRESTAR LIVRO
            else if (opcao == 3) {

                System.out.print("Digite o codigo do livro: ");
                int cod = sc.nextInt();

                boolean encontrou = false;

                for (Livro l : livros) {

                    if (l.codigo == cod) {

                        encontrou = true;

                        if (l.disponivel == true) {

                            l.disponivel = false;

                            System.out.println("Livro emprestado!");

                        } else {

                            System.out.println("Livro ja esta emprestado.");
                        }
                    }
                }

                if (encontrou == false) {
                    System.out.println("Livro nao encontrado.");
                }
            }

            // DEVOLVER LIVRO
            else if (opcao == 4) {

                System.out.print("Digite o codigo do livro: ");
                int cod = sc.nextInt();

                boolean encontrou = false;

                for (Livro l : livros) {

                    if (l.codigo == cod) {

                        encontrou = true;

                        l.disponivel = true;

                        System.out.println("Livro devolvido!");
                    }
                }

                if (encontrou == false) {
                    System.out.println("Livro nao encontrado.");
                }
            }

        } while (opcao != 0);

        sc.close();
    }
}