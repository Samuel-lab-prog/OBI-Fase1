import java.util.Scanner;
public class vard {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if(x >= -8 && x <= 8 && y >=0 && y <= 8)
            System.out.println("S");
        else
            System.out.println("N");

        scanner.close();
    }
}
