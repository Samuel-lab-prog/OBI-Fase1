import java.util.Scanner;

public class  fliper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int p1 = scanner.nextInt();
        int p2 = scanner.nextInt();

        if(p1 == 0){
            System.out.println("C");
        } else if(p2 == 0){
            System.out.println("B");
        } else {
            System.out.println("A");
        }
        scanner.close();
    }
}