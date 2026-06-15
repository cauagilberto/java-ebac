import java.util.Scanner;

public class atividadeMatriz {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[][] numeros = new int[3][3];

        for (int i = 0; i < numeros.length; i++){
            for (int j = 0; j < numeros[i].length; j++){
                int jNovo = j + 1;
                int iNovo = i + 1;
                System.out.print("Insira o número desejado para a posição " + iNovo + "x" + jNovo + ": " );
                numeros[i][j] = leitor.nextInt();
            }
        }

        imprimitMatriz(numeros);

        leitor.close();
    }
    private static void imprimitMatriz(int numeros[][]){
        for (int i = 0; i < numeros.length; i++){
            for (int j = 0; j < numeros[i].length; j++){
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }
    }
}
