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
/*
 * A lógica aqui é usar exclusão de possibilidades, e isso está bem explícito na cadeia de else if utilizada. No primeiro IF eu pergunto se a
 * soma das 3 contas é menor ou igual ao valor disponível, se sim, dou um print no 3 e o programa acaba por aí mesmo, caso oposto, verificio se
 * nenhuma conta pode ser paga. Se essa condição for verdadeira, dou um print no 0 e o programa acaba, caso oposto, significa que no mínimo uma
 * conta pode ser paga, mas não exclui a possibilidade de poder ser duas, mas eu tiro essa dúvida no último else if. 
 */