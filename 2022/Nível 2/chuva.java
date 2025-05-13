import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class chuva {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); 
        int S = scanner.nextInt(); 
        int[] X = new int[N];

        for (int i = 0; i < N; i++) 
            X[i] = scanner.nextInt();
        
        Map<Long, Integer> prefixSums = new HashMap<>();
        prefixSums.put(0L, 1); // soma 0 já foi vista uma vez

        long somaAtual = 0;
        long totalIntervalos = 0;

        for (int i = 0; i < N; i++) {
            somaAtual += X[i];
            long alvo = somaAtual - S;
            totalIntervalos += prefixSums.getOrDefault(alvo, 0);
            prefixSums.put(somaAtual, prefixSums.getOrDefault(somaAtual, 0) + 1);
        }
        System.out.println(totalIntervalos);
        scanner.close();
    }
}