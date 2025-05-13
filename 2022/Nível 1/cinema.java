import java.util.Scanner;

public class cinema {

    public static int calculaPreco(int idade){
        if(idade < 18)
            return 15;
        else if(idade < 60)
            return 30;
        else
            return 20;
    }
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int idade1 = scanner.nextInt();
        int idade2 = scanner.nextInt();

        System.out.println(calculaPreco(idade1) + calculaPreco(idade2));

        scanner.close();
    }
}
