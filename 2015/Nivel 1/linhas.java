import java.util.Scanner;

public class linhas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] ordem = new int[n + 1];

        for (int pos = 1; pos <= n; pos++) {
            int num = scanner.nextInt();
            ordem[num] = pos;
        }

        long cruzamentos = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (ordem[i] > ordem[j]) 
                    cruzamentos++;
            }
        }

        System.out.println(cruzamentos);
        scanner.close();
    }
}
