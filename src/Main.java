import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Escreva o primeiro número: ");
        int num1 = leitor.nextInt();

        System.out.println("Escreva o segundo número: ");
        int num2 = leitor.nextInt();

        if (num1 > num2){
            System.out.println("O número maior é: " + num1);
        } else if (num2 > num1) {
            System.out.println("O número maior é: " + num2);
        } else {
            System.out.println("Os números são iguais!");
        }
    }
}
