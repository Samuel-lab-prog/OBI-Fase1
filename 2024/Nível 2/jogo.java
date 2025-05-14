import java.util.Scanner;

public class jogo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanho = scanner.nextInt(); 
        int qtdPassos = scanner.nextInt(); 
        scanner.nextLine(); 
        scanner.close();

        char[][] matriz = new char[tamanho][tamanho];

        for(int i = 0; i < tamanho; i++) 
            matriz[i] = scanner.nextLine().toCharArray();
        
        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

        for(int passo = 0; passo < qtdPassos; passo++) {
            char[][] novaMatriz = new char[tamanho][tamanho];

            for(int i = 0; i < tamanho; i++) {
                for(int j = 0; j < tamanho; j++) {
                    int vizinhosVivos = 0;
                    for(int d = 0; d < 8; d++) {
                        int ni = i + dx[d];
                        int nj = j + dy[d];

                        if(ni >= 0 && ni < tamanho && nj >= 0 && nj < tamanho && matriz[ni][nj] == '1') 
                            vizinhosVivos++; 
                    }
                    if(matriz[i][j] == '1') 
                        novaMatriz[i][j] = (vizinhosVivos == 2 || vizinhosVivos == 3) ? '1' : '0';
                    else 
                        novaMatriz[i][j] = (vizinhosVivos == 3) ? '1' : '0';   
                }
            }
            matriz = novaMatriz;
        }

        for (int i = 0; i < tamanho; i++) 
            System.out.println(new String(matriz[i]));        
    }
}
