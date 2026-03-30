import java.util.Scanner;

public class VerificadorIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade < 0) {
            System.out.println("Idade inválida, " + nome +  "!");
        } else if (idade < 18) {
            System.out.println(nome + ", você é menor de idade.");
        } else if (idade < 65) {
            System.out.println(nome + ", você é maior de idade.");
        } else {
            System.out.println(nome + ", você é uma pessoa idosa.");
        }

        scanner.close();
    }
}