import java.util.Scanner;

public class ogro {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int esquerda = scanner.nextInt();
        int direita = scanner.nextInt();

        if(esquerda > direita)
            System.out.println(esquerda + direita);
        else
            System.out.println(2 * (direita - esquerda));
        
        scanner.close();
    }
}