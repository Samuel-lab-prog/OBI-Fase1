import java.util.*;

public class triangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] varetas = new int[4];
        for (int i = 0; i < 4; i++) {
            varetas[i] = scanner.nextInt();
        }
        Arrays.sort(varetas);
        if (varetas[0] + varetas[1] > varetas[2]) {
            System.out.println("S");
        } else if(varetas[1] + varetas[2] > varetas[3]) {
            System.out.println("S");
        }
        else {
            System.out.println("N");
        }
        scanner.close();

    }
}