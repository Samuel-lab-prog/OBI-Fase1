import java.util.Scanner;

public class torneio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vencidas = 0;
        for (int i = 1; i < 7; i++) {
            if (scanner.next().equals("P"))
                vencidas += 0;
            else
                vencidas++;
        }
        if (vencidas >= 5)
            System.out.print("1");
        else if (vencidas >= 3)
            System.out.print("2");
        else if (vencidas >= 1)
            System.out.print("3");
        else
            System.out.print("-1");

        scanner.close();
    }
}
