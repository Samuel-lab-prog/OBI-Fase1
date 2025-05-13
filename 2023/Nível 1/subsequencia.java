import java.util.Scanner;
import java.util.ArrayList;

public class subsequencia {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int tamanhoA = scanner.nextInt();
        int tamanhoB = scanner.nextInt();
        ArrayList <Integer> sequenciaA = new ArrayList<>();
        ArrayList <Integer> sequenciaB = new ArrayList<>();

        for(int i = 0; i < tamanhoA; i++)
            sequenciaA.add(scanner.nextInt());

        for(int i = 0; i < tamanhoB; i++)
            sequenciaB.add(scanner.nextInt());

        sequenciaA.retainAll(sequenciaB);

        if(sequenciaA.equals(sequenciaB))
            System.out.println("S");
        else
            System.out.println("N");
            
        scanner.close();
    }
}
