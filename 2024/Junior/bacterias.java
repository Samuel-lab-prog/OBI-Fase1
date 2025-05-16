import java.util.Scanner;

public class bacterias {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int capacidade = scanner.nextInt();
        int fator = scanner.nextInt();

        int qtdBacterias = 1;
        int dias = 0;

        while (qtdBacterias <= capacidade){
            qtdBacterias *= fator;
            dias++;
        }
        System.out.println(dias-1);
        
        scanner.close();
    }
}
/* Isso é apenas um teste para verificar se esta saída é de fato  */