import java.util.Scanner;

public class plano {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int qtdMes = scanner.nextInt();
        int qtdMeses = scanner.nextInt();

        int total = qtdMes * qtdMeses + qtdMes;
        for(int i = 0; i < qtdMeses; i++) {
            total -= scanner.nextInt();
        }
        System.out.println(total);

        scanner.close();
    }
}