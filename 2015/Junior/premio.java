import java.util.Scanner;

public class premio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] acessos = new int[n];
        int soma = 0;
        int diasNecessarios = 0;

        for (int i = 0; i < n; i++) 
            acessos[i] = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            soma += acessos[i];
            diasNecessarios++;
            if (soma >= 1000000) 
                break;
        }

        System.out.println(diasNecessarios);
        scanner.close();
    }
}
