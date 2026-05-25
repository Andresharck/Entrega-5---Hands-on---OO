import java.util.ArrayList;
import java.util.Scanner;

// Classe Pedido
class Pedido {

    int numero;
    String cliente;
    String item;
    double valor;
    String status;

}

public class Exercicio_7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Pedido> pedidos = new ArrayList<>();

        int opcao = 0;

        do {

            System.out.println("\n===== MENU =====");
            System.out.println("1 - Cadastrar pedido");
            System.out.println("2 - Listar pedidos");
            System.out.println("3 - Atualizar status");
            System.out.println("4 - Buscar pedido");
            System.out.println("5 - Mostrar valor total");
            System.out.println("0 - Sair");

            System.out.print("Escolha uma opcao: ");
            opcao = sc.nextInt();
            sc.nextLine();

            // CADASTRAR PEDIDO
            if (opcao == 1) {

                Pedido p = new Pedido();

                System.out.print("Numero do pedido: ");
                p.numero = sc.nextInt();
                sc.nextLine();

                System.out.print("Nome do cliente: ");
                p.cliente = sc.nextLine();

                System.out.print("Item pedido: ");
                p.item = sc.nextLine();

                System.out.print("Valor do pedido: ");
                p.valor = sc.nextDouble();
                sc.nextLine();

                p.status = "PENDENTE";

                pedidos.add(p);

                System.out.println("Pedido cadastrado!");
            }

            // LISTAR PEDIDOS
            else if (opcao == 2) {

                if (pedidos.size() == 0) {

                    System.out.println("Nenhum pedido cadastrado.");

                } else {

                    for (Pedido p : pedidos) {

                        System.out.println("\nNumero: " + p.numero);
                        System.out.println("Cliente: " + p.cliente);
                        System.out.println("Item: " + p.item);
                        System.out.println("Valor: R$ " + p.valor);
                        System.out.println("Status: " + p.status);
                    }
                }
            }

            // ATUALIZAR STATUS
            else if (opcao == 3) {

                System.out.print("Digite o numero do pedido: ");
                int num = sc.nextInt();
                sc.nextLine();

                boolean encontrou = false;

                for (Pedido p : pedidos) {

                    if (p.numero == num) {

                        encontrou = true;

                        System.out.println("Digite o novo status:");
                        System.out.println("PENDENTE");
                        System.out.println("PREPARANDO");
                        System.out.println("FINALIZADO");

                        p.status = sc.nextLine();

                        System.out.println("Status atualizado!");
                    }
                }

                if (encontrou == false) {

                    System.out.println("Pedido nao encontrado.");
                }
            }

            // BUSCAR PEDIDO
            else if (opcao == 4) {

                System.out.print("Digite o numero do pedido: ");
                int num = sc.nextInt();

                boolean encontrou = false;

                for (Pedido p : pedidos) {

                    if (p.numero == num) {

                        encontrou = true;

                        System.out.println("\nNumero: " + p.numero);
                        System.out.println("Cliente: " + p.cliente);
                        System.out.println("Item: " + p.item);
                        System.out.println("Valor: R$ " + p.valor);
                        System.out.println("Status: " + p.status);
                    }
                }

                if (encontrou == false) {

                    System.out.println("Pedido nao encontrado.");
                }
            }

            // MOSTRAR VALOR TOTAL
            else if (opcao == 5) {

                double total = 0;

                for (Pedido p : pedidos) {

                    total = total + p.valor;
                }

                System.out.println("Valor total dos pedidos: R$ " + total);
            }

        } while (opcao != 0);

        sc.close();
    }
}