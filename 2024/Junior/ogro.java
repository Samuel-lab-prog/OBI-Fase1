import java.util.Scanner;

public class ogro {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int left = scanner.nextInt();
        int direita = scanner.nextInt();

        if(left > direita)
            System.out.println(esquerda + direita);
        else
            System.out.println(2 * (direita - left));
        
        scanner.close();
    }
}
