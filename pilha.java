import java.util.Stack;

public class pilha {
    public static void main(String[] args) {
        
        //gerando uma pilha
        Stack<String> livros = new Stack<>();

        //adicionando elemento à pilha
        livros.push("comédia"); //elemento 1
        livros.push("romance"); //elemento 2
        livros.push("drama"); //elemento 3
        livros.push("terror"); //elemento 4 (próximo a sair)
        
        //retornando ultimo elemento 
        System.out.println("Proximo a sair: " + livros.peek());

        //tirando e retornando ultimo elemento
        System.out.println("\nSaiu: " + livros.pop());
        System.out.println("Proximo a sair: " + livros.peek());
    }
}
