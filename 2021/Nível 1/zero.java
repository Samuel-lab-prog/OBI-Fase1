import java.util.ArrayList;
import java.util.Scanner;

public class zero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int x = scanner.nextInt();
            if (x == 0 && !lista.isEmpty()) {
                lista.remove(lista.size() - 1); 
            } else if (x != 0) {
                lista.add(x); 
            }
        }

        int soma = 0;
        for (int num : lista) {
            soma += num;
        }

        System.out.println(soma);
        scanner.close();
    }
}
