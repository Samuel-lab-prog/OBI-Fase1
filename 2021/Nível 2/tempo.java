import java.util.*;

public class tempo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numEventos = scanner.nextInt(); 
        scanner.nextLine(); 

        Map<Integer, Integer> tempoResposta = new TreeMap<>();
        Map<Integer, Integer> ultimaMensagemRecebida = new HashMap<>();
        Set<Integer> amigos = new HashSet<>();

        int tempoAtual = 0;

        for(int i = 0; i < numEventos; i++) {
            String[] partes = scanner.nextLine().split(" ");
            String tipo = partes[0];

            if(tipo.equals("T")) {
                int t = Integer.parseInt(partes[1]);
                tempoAtual += t;
            } else {
                int amigo = Integer.parseInt(partes[1]);
                amigos.add(amigo);
                tempoAtual++; 

                if(tipo.equals("R")) {
                    if (ultimaMensagemRecebida.containsKey(amigo)) {
                        tempoResposta.put(amigo, -1);
                    } else {
                        ultimaMensagemRecebida.put(amigo, tempoAtual);
                    }
                } else if (tipo.equals("E")) {
                    if(!ultimaMensagemRecebida.containsKey(amigo)) 
                        tempoResposta.put(amigo, -1);
                    else if (tempoResposta.getOrDefault(amigo, 0) != -1) {
                        int tempoMsg = tempoAtual - ultimaMensagemRecebida.get(amigo);
                        tempoResposta.put(amigo, tempoResposta.getOrDefault(amigo, 0) + tempoMsg);
                        ultimaMensagemRecebida.remove(amigo);
                    }
                }
            }
        }

        for (int amigo : ultimaMensagemRecebida.keySet()) 
            tempoResposta.put(amigo, -1);
        
        for (int amigo : new TreeSet<>(amigos)) {
            int tempo = tempoResposta.getOrDefault(amigo, 0);
            System.out.println(amigo + " " + tempo);
        }
        scanner.close();
    }
}
