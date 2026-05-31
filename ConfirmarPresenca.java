
import java.util.Scanner;

public class Presenca{
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        String nome;
        int idade;
        String opcao;
        String cpf;
        
        System.out.println("=".repeat(30));
        System.out.println("CONFIRME SUA PRESENÇA");
        System.out.println("=".repeat(30));

        System.out.print("Digite seu nome: ");
        nome = leia.nextLine();

        System.out.print("Digite sua idade: ");
        idade = leia.nextInt();
        leia.nextLine(); // limpa o buffer

        if (idade >= 18) {
            System.out.println("Maior de idade");
            System.out.println("=".repeat(30));
            System.out.println("PRECENÇA CONFIRMADA");
            System.out.println("=".repeat(30));
        } else {
            System.out.println("Você precisa de um responsável para confirmar sua presença!");

            System.out.print("Está com responsável? (sim/não): ");
            opcao = leia.nextLine();

            switch (opcao.toLowerCase()) {
                case "sim":
                    System.out.print("Nome completo do responsável: ");
                    nome = leia.nextLine();

                    System.out.print("Digite o CPF do responsável: ");
                    cpf = leia.nextLine();
                    

                    System.out.println("=".repeat(30));
                    System.out.println("PRECENÇA CONFIRMADA");
                    System.out.println("=".repeat(30));

                    break;

                case "nao":
                    System.out.println("=".repeat(30));
                    System.out.println("TENTE MAIS TARDE");
                    System.out.println("=".repeat(30));
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }

        leia.close();
    }
}