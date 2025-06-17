import java.util.Scanner;

public class mobile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        if((a == b + c + d) && (b + c == d) && (b == c))
            System.out.println("S");
        else
            System.out.println("N");
        scanner.close();
    }
}