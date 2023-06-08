import java.util.LinkedList;
import java.util.Queue;

public class fila {
    public static void main(String[] args) {

        //gerando uma fila
        Queue<String> filmes = new LinkedList<>();

        //adicionando elementos à uma fila
        filmes.add("comédia");
        filmes.add("romance");
        filmes.add("drama");
        filmes.add("terror");

        //retornando topo da fila
        System.out.println("Topo da fila: " + filmes.peek());

        //tirando e retornando primeiro elemento
        System.out.println("\nSaiu: " + filmes.poll());
        System.out.println("Proximo a sair: " + filmes.peek());
    }
}
