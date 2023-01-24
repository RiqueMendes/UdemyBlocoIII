import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {
       

        double[] notasAlunoA = new double[4];

        notasAlunoA[0] = 8;
        notasAlunoA[1] = 7; 
        notasAlunoA[2] = 7.5;
        notasAlunoA[3] = 7.5;

        System.out.println(Arrays.toString(notasAlunoA));

        double total = 0;

     for (int i = 0; i < notasAlunoA.length ; i ++){
        total += notasAlunoA[i];
     }

        System.out.println(total / notasAlunoA.length);

        double[] notasAlunoB = {5, 8 , 7 , 9 };

        total = 0;
        for(int i = 0 ; i < notasAlunoB.length ; i ++) {
            total += notasAlunoB[i];

        }

        System.out.println(total / notasAlunoB.length);

        
    }

   
}
