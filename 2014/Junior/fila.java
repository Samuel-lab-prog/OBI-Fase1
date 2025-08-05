import java.util.*;

public class fila {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int qtdPessoas = scanner.nextInt();
        ArrayList<Integer> fila = new ArrayList<>();
        for (int i = 0; i < qtdPessoas; i++) {
            fila.add(scanner.nextInt());
        }

        int qtdSairam = scanner.nextInt();
        ArrayList<Integer> sairam = new ArrayList<>();
        for (int i = 0; i < qtdSairam; i++) {
            sairam.add(scanner.nextInt());
        }
        fila.removeAll(sairam);
        for (int pessoa : fila) {
            System.out.print(pessoa + " ");
        }
        scanner.close();
    }
}