package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

    public static void main(String[] args) {

        HashSet conjunto = new HashSet();

        conjunto.add(1.2); // double -> Double
        conjunto.add(true); // boolean -> Boolean
        conjunto.add("teste");
        conjunto.add(1);
        conjunto.add("x");

        System.out.println(conjunto.size());

        conjunto.add("teste"); // Não aceita repeticoes
        System.out.println(conjunto.size());

        System.out.println(conjunto.remove("teste"));
        System.out.println(conjunto.size());
        System.out.println(conjunto.contains("x"));

        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(conjunto);
        System.out.println(nums);

        conjunto.addAll(nums); //uniao de 2 conjuntos
        System.out.println(conjunto);

        conjunto.retainAll(nums);
        System.out.println(conjunto);

        conjunto.clear(); //Limpando conjunto
        System.out.println(conjunto);
    }
}
