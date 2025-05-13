import java.util.Scanner;

public class chinelos {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int qtdTamanhos = scanner.nextInt();
        int[] chinelos = new int[qtdTamanhos+1];

        for(int i = 1; i <= qtdTamanhos; i++)
            chinelos[i] = scanner.nextInt();

        int qtdPedidos = scanner.nextInt();
        int[] pedidos = new int[qtdPedidos];

        int vendas = 0;

        for(int i = 0; i < qtdPedidos; i++){
            pedidos[i] = scanner.nextInt();

            if(chinelos[pedidos[i]] > 0){
                vendas++;
                chinelos[pedidos[i]]--;
            }
        }
        System.out.println(vendas);
            
        scanner.close();
    }
}
