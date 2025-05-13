import java.util.Scanner;

public class bombom {

    public static Scanner scanner = new Scanner(System.in);

    public static int calculaValor(String carta, char naipeDominante){
        int valor = 0;
        switch (carta.charAt(0)) {
            case 'A':
                valor = 10;
                break;
            case 'J':
                valor = 11;
                break;
            case 'Q':
                valor = 12;
                break;
            case 'K':
                valor = 13;
                break;
        }
        if(carta.charAt(1) == naipeDominante)
            valor += 4;

        return valor;
    }

    public static void main(String[] args) {
        
        String carta1 = scanner.next();
        String carta2 = scanner.next();
        String carta3 = scanner.next();
        String carta4 = scanner.next();
        String carta5 = scanner.next();
        String carta6 = scanner.next();
        String carta7 = scanner.next();

        char naipeDominante = carta1.charAt(1);

        int pontosLuana = calculaValor(carta2, naipeDominante) + calculaValor(carta3, naipeDominante) + calculaValor(carta4, naipeDominante);
        int pontosEdu = calculaValor(carta5, naipeDominante) + calculaValor(carta6, naipeDominante) + calculaValor(carta7, naipeDominante);

        if(pontosLuana > pontosEdu)
            System.out.println("Luana");
        else if(pontosEdu == pontosLuana)
            System.out.println("empate");
        else{
            System.out.println("Edu");
        }
        scanner.close();
    }
}