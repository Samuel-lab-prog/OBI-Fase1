import java.util.Scanner;

public class show {

    public static Scanner scanner = new Scanner(System.in);

    public static String[] lerAssentos(int numFilas){
        String[] assentos = new String[numFilas];

        for(int i = 0; i < numFilas; i++){
            assentos[i] = scanner.nextLine();
            assentos[i] = assentos[i].replaceAll("\\s+", "");
        }
        return assentos;
    }

    public static int buscarFila(String[] assentos, String amigos, int numAmigos, int numFilas, int numAssentos){
        int posicao = -1;
        for(int i = 0; i < numFilas; i++){
            if(assentos[i].contains(amigos))
                posicao = numFilas - i;
        }
        return posicao;
    }

    public static void main(String[] args) {

        int numAmigos = scanner.nextInt();
        int numFilas = scanner.nextInt();
        int numAssentos = scanner.nextInt();
        scanner.nextLine();

        String[] assentos = lerAssentos(numFilas);

        String amigos = "";
        for(int i = 0; i < numAmigos; i++)
            amigos += "0";

        System.out.println(buscarFila(assentos, amigos, numAmigos, numFilas, numAssentos));
        scanner.close();
        }
    }
