package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    
    public static void main(String[] args) {
        
        Queue<String> fila = new LinkedList<>();

        fila.add("Ana"); //Retorna erro
        fila.offer("Bia"); //Retorna falso caso nao consiga add
        fila.offer("Pedro");
        fila.offer("Gui");
        fila.offer("Rafaela");

        System.out.println(fila.peek()); //Caso esteja vazia retorna false
        System.out.println(fila.element()); //Caso esteja vazia retorna exception 

      //fila.clear(); // Limpa a fila
      //fila.size(); Tamanho da fila
      //fila.contains(...) ve se contem elemento
      
      //Chama o elemento e o remove
      System.out.println(fila.poll()); //Retorna false

      System.out.println(fila);

      //Remove elemento da lista //Retorna exception
      System.out.println(fila.remove());


    }
}
