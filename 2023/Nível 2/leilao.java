import java.util.Scanner;

public class leilao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int qtdLances = scanner.nextInt();
        scanner.nextLine();

        if(qtdLances == 0){
            scanner.close();
            return;
        }
        
        int[] valorLances = new int[qtdLances];
        String[] nomes = new String[qtdLances];

        nomes[0] = scanner.nextLine();
        valorLances[0] = scanner.nextInt();
        scanner.nextLine();

        int maiorValor = valorLances[0];
        String ganhador = nomes[0];

        for(int i = 1; i < qtdLances; i++){
            nomes[i] = scanner.nextLine();
            valorLances[i] = scanner.nextInt();
            scanner.nextLine();
            
            if(valorLances[i] > valorLances[i-1]){
                maiorValor = valorLances[i];
                ganhador = nomes[i];
            }
        }
        System.out.println(ganhador);
        System.out.println(maiorValor);
        scanner.close();
    }
}
