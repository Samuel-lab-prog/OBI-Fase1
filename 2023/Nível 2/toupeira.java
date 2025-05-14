import java.util.*;

public class toupeira {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numSalas = scanner.nextInt(); 
        int numTuneis = scanner.nextInt(); 

        boolean[][] ligado = new boolean[numSalas + 1][numSalas + 1];

        for(int i = 0; i < numTuneis; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            ligado[a][b] = true;
            ligado[b][a] = true; 
        }

        int numSugestoes = scanner.nextInt(); 
        int totalValidos = 0;

        for(int i = 0; i < numSugestoes; i++) {
            int salasPasseio = scanner.nextInt(); 
            int[] passeio = new int[salasPasseio];

            for(int j = 0; j < salasPasseio; j++) 
                passeio[j] = scanner.nextInt();
            
            boolean valido = true;
            for(int j = 0; j < salasPasseio - 1; j++) {
                if(!ligado[passeio[j]][passeio[j + 1]]) {
                    valido = false;
                    break;
                }
            }
            if(valido) 
                totalValidos++;
        }
        System.out.println(totalValidos);
        scanner.close();
    }
}
