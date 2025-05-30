import java.util.Scanner;

public class cavalo {

    public static int andar(int[] movimentos, int[][] matriz){
        int cavaloX = 4;
        int cavaloY = 3;
        int saltos = 0;

        for(int i = 0; i < movimentos.length; i++){
            int etapa = movimentos[i];
            switch (etapa) {
                case 1:
                    matriz[cavaloX][cavaloY] = 0;
                    cavaloX += 1;
                    cavaloY += 2;
                    saltos++;
                    if(matriz[cavaloX][cavaloY] == -2)
                        return saltos;
                    else{
                    matriz[cavaloX][cavaloY] = 1;
                    break;
                    }
                case 2:
                    matriz[cavaloX][cavaloY] = 0;
                    cavaloX += 2;
                    cavaloY += 1;
                    saltos++;
                    if(matriz[cavaloX][cavaloY] == -2)
                        return saltos;
                    else{
                    matriz[cavaloX][cavaloY] = 1;
                    break;
                    }
                case 3:
                    matriz[cavaloX][cavaloY] = 0;
                    cavaloX += 2;
                    cavaloY -= 1;
                    saltos++;
                    if(matriz[cavaloX][cavaloY] == -2)
                        return saltos;
                    else{
                    matriz[cavaloX][cavaloY] = 1;
                    break;
                    }
                case 4:
                    matriz[cavaloX][cavaloY] = 0;
                    cavaloX += 1;
                    cavaloY -= 2;
                    saltos++;
                    if(matriz[cavaloX][cavaloY] == -2)
                        return saltos;
                    else{
                    matriz[cavaloX][cavaloY] = 1;
                    break;
                    }
                    case 5:
                    matriz[cavaloX][cavaloY] = 0;
                    cavaloX -= 1;
                    cavaloY -= 2;
                    saltos++;
                    if(matriz[cavaloX][cavaloY] == -2)
                        return saltos;
                    else{
                    matriz[cavaloX][cavaloY] = 1;
                    break;
                    }
                    case 6:
                    matriz[cavaloX][cavaloY] = 0;
                    cavaloX -= 2;
                    cavaloY -= 1;
                    if(matriz[cavaloX][cavaloY] == -2)
                        return saltos;
                    else{
                    matriz[cavaloX][cavaloY] = 1;
                    break;
                    }
                    case 7:
                    matriz[cavaloX][cavaloY] = 0;
                    cavaloX -= 2;
                    cavaloY += 1;
                    saltos++;
                    if(matriz[cavaloX][cavaloY] == -2)
                        return saltos;
                    else{
                    matriz[cavaloX][cavaloY] = 1;
                    saltos++;
                    break;
                    }
                    case 8:
                    matriz[cavaloX][cavaloY] = 0;
                    cavaloX -= 1;
                    cavaloY += 2;
                    saltos++;
                    if(matriz[cavaloX][cavaloY] == -2)
                        return saltos;
                    else{
                    matriz[cavaloX][cavaloY] = 1;
                    break;
                    }
            }
       
        }
        return saltos;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidade = scanner.nextInt();
        int[] movimentos = new int[quantidade];

        for(int i = 0; i < quantidade; i++)
            movimentos[i] = scanner.nextInt();
        
        int[][] matriz = new int[8][8];

        for(int i = 0; i < 8; i++){
            for(int k = 0; k < 8; k++){
                matriz[i][k] = 0;
            }
        }
        matriz[1][3] = -2;
        matriz[2][3] = -2;
        matriz[2][5] = -2;
        matriz[5][4] = -2;
        matriz[4][3] = 1;


        System.out.println(andar(movimentos, matriz));
        scanner.close();

    }
}
