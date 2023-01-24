package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {

        SortedSet<String> listaAprovados = new TreeSet<>(); // Respeita a ordem
        listaAprovados.add("Ana");
        listaAprovados.add("Carlos");
        listaAprovados.add("Lucas");
        listaAprovados.add("Pedro");
        System.out.println(listaAprovados);

        for (String candidato : listaAprovados) {
            System.out.println(candidato);
        }

        Set<Integer> nums = new HashSet<>(); // Nao respeita ordem
        nums.add(1);
        nums.add(15);
        nums.add(8);
        nums.add(120);
        for (int n : nums) {
            System.out.println(n);
        }
    }
}
