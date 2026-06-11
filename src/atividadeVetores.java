import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class atividadeVetores {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor: ");
        int tam = leitor.nextInt();

        double vetor[] = new double[tam];

        //aloca cada valor ao espaço no vetor
        for (int i = 0; i < vetor.length; i++){
            System.out.print("Digite o número da posição " + i + " do seu vetor: ");
            vetor[i] = leitor.nextInt();
        }

        //se possição for par multiplica por 2 se impar eleva por 2
        for (int i = 0; i < vetor.length; i++){
            if (i % 2 == 0){
                vetor[i] = vetor[i] * 2;
            }else {
                vetor[i] = Math.pow(vetor[i],2);
            }
        }

        //reorganizar os vetores
        bubbleSort(vetor);

        //valores do vetor
        exibitVetor(vetor);

        leitor.nextLine();
        System.out.println("Digite a palavra: ");
        String palavra = leitor.nextLine().toLowerCase();

        contaVogais(palavra);

        //anotção das aulas
        /*System.out.println("\nDigite o tamanho do vetor: ");
        int tam2 = leitor.nextInt();

        //limpa o scanner para reacessar no proximo leitor
        String[] vetorPalavra = new String[tam2];
        leitor.nextLine();
        System.out.println("Digite a palavra: ");
        for (int i = 0; i < vetorPalavra.length; i++){
            vetorPalavra[i] = leitor.nextLine();
        }*/

        //exive a palavra
        //exibitVetorString(vetorPalavra);

        leitor.nextLine();
        System.out.println("Digite o nome a ser invertido");
        String nome = leitor.nextLine();

        String inverte = "";
        for (int i = nome.length() - 1; i>= 0; i--){
            inverte += nome.charAt(i);
        }

        System.out.println(inverte);

        leitor.close();
    }
    private static void exibitVetor(double vetor[]){
        for (int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + ", ");
        }
    }
    /*private static void exibitVetorString(String vetor[]){
        for (int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + ", ");
        }
    }*/
    private static void bubbleSort(double vetor[]){
        for (int i = 0; i < vetor.length - 1; i++){
            for (int j = 0; j < vetor.length - i - 1; j++){
                if (vetor[j] > vetor[j + 1]) {
                    double ante = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = ante;
                }
            }
        }
    }
    private static void contaVogais(String palavra){
        int contador = 0;

        for (int i = 0; i < palavra.length(); i++){
            char letra = palavra.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                contador++;
            }
        }

        System.out.println("Total de vogais da palavra: " + contador);
    }
}
