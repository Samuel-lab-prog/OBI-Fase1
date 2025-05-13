import java.util.Scanner;

public class estoque {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int qtdTipos = scanner.nextInt();
        int qtdTamanhos = scanner.nextInt();
        int[][] matriz = new int[qtdTipos][qtdTamanhos];

        for(int i = 0; i < qtdTipos; i++){
            for(int j = 0; j < qtdTamanhos; j++){
                matriz[i][j] = scanner.nextInt();
            }
        }

        int qtdPedidos = scanner.nextInt();
        int[][] matrizPedidos = new int[qtdPedidos][2];

        for(int i = 0; i < qtdPedidos; i++){
            for(int j = 0; j < 2; j++){
                matrizPedidos[i][j] = scanner.nextInt();
            }
        }
        int vendas = 0;
        for(int i = 0; i < qtdPedidos; i++){
            int qtdProduto = matriz[matrizPedidos[i][0] - 1][matrizPedidos[i][1]- 1];
            if(qtdProduto > 0){
                matriz[matrizPedidos[i][0] - 1][matrizPedidos[i][1]- 1]--;
                vendas++;
            }
        }
        System.out.println(vendas);
        scanner.close();
    }
}
