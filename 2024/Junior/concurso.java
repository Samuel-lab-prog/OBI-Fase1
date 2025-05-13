import java.util.Arrays;
import java.util.Scanner;

public class concurso {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int numCandidatos = scanner.nextInt();
        int minAprovados = scanner.nextInt();

        int[] notasCandidatos = new int[numCandidatos];

        for(int i = 0; i < numCandidatos; i++)
            notasCandidatos[i] = scanner.nextInt();

        Arrays.sort(notasCandidatos);
        System.out.println(notasCandidatos[numCandidatos - minAprovados]);

        scanner.close();
    }
}