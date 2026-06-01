import java.util.Scanner;

public class ContagemRegressiva{
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite quantos segundos: ");
        int segundos = scanner.nextInt();

        while (segundos > 0) {
            System.out.println("Tempo restante: " + segundos + " segundos");
            Thread.sleep(1000); // pausa de 1 segundo
            segundos--;
        }

        System.out.println("Tempo esgotado!");
        scanner.close();
    }
}