import java.util.Scanner;

public class piloto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int distEsq = B - A; 
        int distDir = C - B; 

        if (distEsq < distDir) {
            System.out.println(1);  
        } else if (distEsq > distDir) {
            System.out.println(-1); 
        } else {
            System.out.println(0);  
        }

        scanner.close();
    }
}

