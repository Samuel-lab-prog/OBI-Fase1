import java.util.Scanner;

public class contas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor = scanner.nextInt();
        int acougue = scanner.nextInt();
        int farmacia = scanner.nextInt();
        int padaria = scanner.nextInt();

        int ap = acougue + padaria;
        int af = acougue + farmacia;
        int pf = farmacia + padaria;

        if(acougue + farmacia + padaria <= valor)
            System.out.println(3);
        else if(acougue > valor && padaria > valor && farmacia > valor)
            System.out.println(0);
        else if(ap > valor & af > valor & pf > valor)
            System.out.println(1);
        else
            System.out.println(2);
            
        scanner.close();
    }
}
