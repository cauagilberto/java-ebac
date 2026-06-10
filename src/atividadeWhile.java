import java.util.Scanner;

public class atividadeWhile {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int pergunta;
        do {
            System.out.print("Escreva o número que deseja calcular a tabuada: ");
            int numb = leitor.nextInt();
            int cont = 1;
            while (cont <= 10) {
                int result = numb * cont;
                System.out.println(numb + "x" + cont + "=" + result);

                cont += 1;
            }
            System.out.println("1. Continuar \n2. Sair");
            pergunta = leitor.nextInt();

        } while (pergunta == 1);
    }
}
