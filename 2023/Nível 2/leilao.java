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
/*
Eu passei um bom tempo nessa questão perguntando-me qual seria a melhor estrutura de dados para resolver um problema. Eu queria usar apenas um
vetor mas não deu muito certo, acabei usando um vetor que armazena os nomes e outro que armazena os lances, como os dois são preenchidos ao  mesmo
tempo, eles estão linkados pelo índice. Para descobrir o maior lance é simples: basta comparar com o lances[i-1], caso ele for menor, atualize o novo
maior lance para lances[i] e o ganhador para nomes[i]. Perceba que há um if logo no começo para verificar se nenhum lance foi feito. Há também a
necessidadae de ler o primeiro lance fora do for, pois não existe posicão [-1];
*/
