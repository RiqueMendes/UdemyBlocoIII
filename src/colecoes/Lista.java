package colecoes;

import java.util.ArrayList;

public class Lista {
    
    public static void main(String[] args) {
        
        ArrayList<Usuario> lista = new ArrayList<>();


        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Lia"));
        lista.add(new Usuario("Bia"));
        lista.add(new Usuario("Manu"));

        
       
        for(Usuario u: lista){
            System.out.println(u);
        }
        System.out.println(lista.get(3) + " Usuario de index 3"); //Acessar pelo index

        lista.remove(1);
        System.out.println(lista);
        System.out.println(lista.remove(new Usuario ("Manu")));
        System.out.println(lista);
        System.out.println(lista.contains(new Usuario("Bia")));
    }
}
