import java.util.Scanner;

public class CalcularMedia {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double[] nota = new double[4];
        double soma = 0.0;
        double media;
        int contador;

        for (contador = 0; contador < 4; contador++) {
            System.out.print("Digite a nota: ");
            nota[contador] = leia.nextDouble();
            soma += nota[contador];
        }

        media = soma / 4;

        System.out.println("A média da turma é: " + media);

        if (media < 7) {
            System.out.println("Sua turma está abaixo da média!");
        } else {
            System.out.println("Sua turma está acima da média!");
        }

        leia.close();
    }
}