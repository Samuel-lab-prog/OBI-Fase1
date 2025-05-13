import java.util.Scanner;

public class premio {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int paes = scanner.nextInt();
        int doces = scanner.nextInt();
        int bolos = scanner.nextInt();

        int pontos = paes + doces*2 + bolos*3; 

        if(pontos >= 150)
            System.out.println("B");
        else if(pontos >= 120)
            System.out.println("D");
        else if(pontos >= 100)
            System.out.println("P");
        else
            System.out.println("N");
        
        scanner.close();
    }
}