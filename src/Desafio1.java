import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a quantidade de notas: ");
        int qtdeNotas = entrada.nextInt();

        double[] notas = new double[qtdeNotas];
        System.out.println(qtdeNotas);

        double total = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Informe a nota " + (i + 1) + ":");
            notas[i] = entrada.nextInt();

            total += notas[i]; // Somatoria total de notas do Aluno
        }
        double criterio = total / notas.length; // Somatoria total de notas do Aluno divido pelo numero de notas
        if (criterio <= 5) {
            System.out.println("Aluno reprovado");
        } else if (criterio >= 5) {
            System.out.println("Aluno aprovado");
        }
        entrada.close();
    }
}