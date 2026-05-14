import java.util.ArrayList;
import java.util.Scanner;

public class SistemaPedidos {

    static ArrayList<String> clientes = new ArrayList<>();
    static ArrayList<String> pedidos = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n1 - Cadastrar");
            System.out.println("2 - Criar pedido");
            System.out.println("3 - Listar pedidos");
            System.out.println("4 - Sair");

            System.out.print("Escolha: ");
            String opcao = sc.nextLine();

            if (opcao.equals("1")) {

                System.out.print("Nome do cliente: ");
                String nome = sc.nextLine();

                clientes.add(nome);

                System.out.println("Cliente cadastrado!");

            } else if (opcao.equals("2")) {

                if (clientes.isEmpty()) {
                    System.out.println("Nenhum cliente cadastrado!");
                    continue;
                }

                System.out.print("Nome do cliente: ");
                String cliente = sc.nextLine();

                System.out.println("1 - Pizza");
                System.out.println("2 - Hambúrguer");
                System.out.println("3 - Salada");

                System.out.print("Escolha um item: ");
                String item = sc.nextLine();

                String pedido = cliente + " pediu ";

                if (item.equals("1")) {
                    pedido += "Pizza";
                } else if (item.equals("2")) {
                    pedido += "Hambúrguer";
                } else if (item.equals("3")) {
                    pedido += "Salada";
                } else {
                    System.out.println("Opção inválida!");
                    continue;
                }

                pedidos.add(pedido);

                System.out.println("Pedido criado!");

            } else if (opcao.equals("3")) {

                System.out.println("\nPEDIDOS:");

                for (String pedido : pedidos) {
                    System.out.println(pedido);
                }

            } else if (opcao.equals("4")) {

                System.out.println("Saindo...");
                break;

            } else {

                System.out.println("Opção inválida!");
            }
        }

        sc.close();
    }
}