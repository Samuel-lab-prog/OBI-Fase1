import java.util.*;

public class fita {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] fita = new int[n];
        int[] resultado = new int[n];

        for (int i = 0; i < n; i++) 
            fita[i] = scanner.nextInt();
        
        int[] distEsquerda = new int[n];
        Arrays.fill(distEsquerda, Integer.MAX_VALUE);

        int ultimaZero = -1;
        for (int i = 0; i < n; i++) {
            if (fita[i] == 0) {
                ultimaZero = i;
                distEsquerda[i] = 0;
            }
            else if (ultimaZero != -1) 
                distEsquerda[i] = i - ultimaZero;
            
        }

        int[] distDireita = new int[n];
        Arrays.fill(distDireita, Integer.MAX_VALUE);

        ultimaZero = -1;
        for (int i = n - 1; i >= 0; i--) {
            if (fita[i] == 0) {
                ultimaZero = i;
                distDireita[i] = 0;
            } 
            else if (ultimaZero != -1) 
                distDireita[i] = ultimaZero - i;
        }

        for (int i = 0; i < n; i++) {
            int menorDist = Math.min(distEsquerda[i], distDireita[i]);
            if (menorDist >= 9) 
                resultado[i] = 9;
            else 
                resultado[i] = menorDist;
            
        }

        for (int i = 0; i < n; i++) {
            System.out.print(resultado[i]);
            if (i != n - 1) 
                System.out.print(" ");
        }
        scanner.close();
    }
}
