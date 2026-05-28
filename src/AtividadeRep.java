import java.util.Scanner;

public class AtividadeRep {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o número de preferencia: ");
        int n1 = leitor.nextInt();

        decrescente(n1);
        crescenete(n1);

        System.out.print("Digite seu nome: ");
        String nome = leitor.next();

        printName(nome, n1);
    }
    public static int decrescente(int num){
        for(int i = 0; i <= num; i++){
            System.out.println("O contador está em: " + i);
        }
        return num;
    }
    public static int crescenete(int num){
        for(int i = num; i >= 0; i--) {
            System.out.println("O contador está em: " + i);
        }
        return num;
    }
    public static void printName(String nome, int num){
        if (nome.length() > 6){
            for (int i = 1; i <= num; i++){
                System.out.println(nome);
            }
        }else {
            System.out.println(nome);
        }
    }
}
