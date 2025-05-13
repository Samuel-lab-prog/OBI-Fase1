import java.util.Scanner;

public class maior {

    public static int somaDosDigitos(int numero) {
        int soma = 0;
        while (numero > 0) {
            soma += numero % 10;
            numero /= 10;
        }
        return soma;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int S = scanner.nextInt();

        for (int i = M; i >= N; i--) {
            if (somaDosDigitos(i) == S) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);

        scanner.close();

    }

}
