import java.util.Scanner;

public class arquivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int qtd = scanner.nextInt();
        int tamanhoMax = scanner.nextInt();
        int[] tamanhos = new int[qtd];
        int soma = 0;

        for (int i = 0; i < qtd; i++) {
            tamanhos[i] = scanner.nextInt();
            soma += tamanhos[i];
        }

        int pastasNecessarias = soma / tamanhoMax;
        System.out.println(pastasNecessarias);

        scanner.close();
    }
}