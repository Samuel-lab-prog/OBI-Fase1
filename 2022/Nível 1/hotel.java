import java.util.Scanner;

public class hotel {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int diariaInicial = scanner.nextInt();
        int aumento = scanner.nextInt();
        int diaChegada = scanner.nextInt();
        int diaria;

        if(diaChegada < 16)
            diaria = (diariaInicial + (aumento * (diaChegada - 1)));          
        else
            diaria = diariaInicial + 14 * aumento;
            
        int total = diaria * (32 - diaChegada);
        System.out.println(total);
        scanner.close();
    }
}