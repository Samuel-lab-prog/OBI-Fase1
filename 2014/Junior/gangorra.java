import java.util.Scanner;

public class gangorra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int p1 = scanner.nextInt();
        int c1 = scanner.nextInt();
        int p2 = scanner.nextInt();
        int c2 = scanner.nextInt();

        if(p1 * c1 == p2 * c2){
            System.out.println("0");
        } else if(p1 * c1 > p2 * c2){
            System.out.println("-1");
        } else {
            System.out.println("1");
        }
        scanner.close();
    }
}