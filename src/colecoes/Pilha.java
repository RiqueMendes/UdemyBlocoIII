package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    
    public static void main(String[] args) {
        
        Deque<String> livros = new ArrayDeque<>();

        livros.add("O Pequeno Principe");
        livros.push("A sombra do vento");
        livros.push("O Hobbit");


        System.out.println(livros); //Como é pilha retorna o ultimo elemento primeiro


        //Add
        //livros.peek();
        //livros.element();


        //Remove
        //lista.pool();
        //lista.remove();;
        //lista.pop();

        for(String livro: livros){
            System.out.println(livro);
        }
      
        //livros.contains("");
      
    }
}
