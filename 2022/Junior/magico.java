import java.util.Scanner;

public class magico {

    public static int somaDaLinha( int matriz[][], int linha){
        int soma = 0; 
        for(int i = 0; i < matriz.length; i ++)
            soma += matriz[linha][i];
        return soma;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dimensao = scanner.nextInt();
        int quadrado[][] = new int[dimensao][dimensao];
        int linhaDoZero = 0;
        int colunaDoZero = 0;

        for(int i = 0; i < dimensao; i++){
            for(int k = 0; k < dimensao; k++){
                quadrado[i][k] = scanner.nextInt();
                if(quadrado[i][k] == 0){
                    linhaDoZero = i;
                    colunaDoZero = k;
                }
            }
        }

      
        int soma1 = somaDaLinha(quadrado, 0);
        int soma2 = somaDaLinha(quadrado, 1);
        int soma3 = somaDaLinha(quadrado, 2);
        int somaGeral;

        if(soma1 == soma2)
            somaGeral = soma1;
        else if(soma1 == soma3)
            somaGeral = soma3;
        else
            somaGeral = soma2;
        
        int somaDoZero = somaDaLinha(quadrado, linhaDoZero);

        System.out.println(somaGeral - somaDoZero);
        System.out.println(linhaDoZero + 1);
        System.out.println(colunaDoZero + 1);
        
     

        scanner.close();
    }
}
