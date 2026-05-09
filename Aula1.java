import java.util.Scanner;
public class Aula1{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("digite seu nome: ");
        String nome = teclado.nextLine();
        System.out.print("digite sua nota: ");
        float nota = teclado.nextFloat();
        //saida de dados 
       System.out.printf("a nota de %s é %.1f",nome, nota);

    }
}
