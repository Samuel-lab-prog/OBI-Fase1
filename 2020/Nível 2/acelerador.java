import java.util.Scanner;

public class acelerador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int distancia = scanner.nextInt();
        int pontoParada = (distancia - 4) % 8;
        System.out.println(pontoParada - 1);

        scanner.close();
    }
}