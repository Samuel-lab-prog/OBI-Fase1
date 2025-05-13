import java.util.Scanner;
import java.util.ArrayList;

public class epidemia {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int infectados = scanner.nextInt();
        int fator = scanner.nextInt();
        int numeroAlvo = scanner.nextInt();

        ArrayList <Integer> listaInfectados = new ArrayList<>();
        listaInfectados.add(infectados);
        int dias = 0;

        while(infectados < numeroAlvo){
            dias++;
            int infectantes = listaInfectados.get(dias - 1);
            infectados += infectantes*fator;
            listaInfectados.add(infectantes*fator);
        }
       
        System.out.println(dias--);

        scanner.close();
    }
}
