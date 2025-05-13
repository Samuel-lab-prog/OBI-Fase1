import java.util.Scanner;
import java.lang.StringBuilder;

public class jogo {

    public static Scanner scanner = new Scanner(System.in);
    public static StringBuilder construtor = new StringBuilder("");

    
    public static char[][][] alteraMatriz(char[][][] matriz, int tamanho, int passoAtual){
        char[][][] matrizAlterada = matriz;
        for(int i = 1; i < tamanho - 1; i++){
            for(int k = 1; k < tamanho - 1; k++){
                int casasVivas = 0;
                if(matriz[i-1][k-1][passoAtual] == '1')
                    casasVivas++;
                if(matriz[i-1][k][passoAtual] == '1')
                    casasVivas++;
                if(matriz[i-1][k+1][passoAtual] == '1')
                    casasVivas++;
                if(matriz[i][k-1][passoAtual] == '1')
                    casasVivas++;
                if(matriz[i][k+1][passoAtual] == '1')
                    casasVivas++;
                if(matriz[i+1][k-1][passoAtual] == '1')
                    casasVivas++;
                if(matriz[i+1][k][passoAtual] == '1')
                    casasVivas++;
                if(matriz[i+1][k+1][passoAtual] == '1')
                    casasVivas++;

                if(matriz[i][k][passoAtual] == '0'){
                    if(casasVivas == 3)
                        matrizAlterada[i][k][passoAtual] = '1';
                    else{}
                }
                else{
                    if(casasVivas == 2 || casasVivas == 3){}
                    else 
                        matrizAlterada[i][k][passoAtual] = '0';
                }
            }
            construtor.append("\n");
        }

        return matrizAlterada;
    }
    public static StringBuilder imprmeMatriz(char[][][] matriz, int tamanho, int passoAtual){

        for(int i = 1; i < tamanho - 1; i++){
            for(int k = 1; k < tamanho - 1; k++){
                construtor.append(matriz[i][k][passoAtual]);
            }
            construtor.append("\n");
        }
        return construtor;
    }
    public static char[][][] lerMatriz(int tamanho, int qtdPassos){

        char[][][] matriz = new char[tamanho][tamanho][qtdPassos];
        for(int i = 1; i < tamanho - 1; i++){
            String linha = scanner.nextLine();
            char[] carecteres = linha.toCharArray();

            for(int k = 1; k < tamanho - 1; k++)
                matriz[i][k][0] = carecteres[k-1];
        }
        return matriz;
    }
    public static void main(String[] args) {
        
        int numLinhas = scanner.nextInt() + 2;
        int numPassos = scanner.nextInt() + 1;
        scanner.nextLine();

        char[][][] matriz = lerMatriz(numLinhas+2, numPassos+1);

        System.out.println(imprmeMatriz(alteraMatriz(matriz, numLinhas, numPassos), numLinhas, 0));
        






        scanner.close();
    }
}
