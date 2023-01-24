package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
    
    public static void main(String[] args) {
        
        Map<Integer, String> usuarios = new HashMap<>();


        usuarios.put(1, "Carlos");
        usuarios.put(2, "Joao");
        usuarios.put(3, "Roberto");
        usuarios.put(1, "Marcos"); //Sobrepoe caso ja exista

        System.out.println(usuarios);

        
        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());
        System.out.println(usuarios.keySet()); //chave
        System.out.println(usuarios.values()); //valor
        System.out.println(usuarios.entrySet()); //chave e valor
        System.out.println(usuarios.containsKey(2));
        System.out.println(usuarios.get(2));


        for(int chave : usuarios.keySet()){
            System.out.println(chave);
        }
        

        for (String usuario: usuarios.values()){
            System.out.println(usuario);
        }

        for(Entry<Integer, String> registro : usuarios.entrySet()){
            System.out.println(registro);
            System.out.println(">>> " + registro.getKey() + " " );
            System.out.println(registro.getValue());
        }

        System.out.println(usuarios.remove(4));
        System.out.println(usuarios);
}
}