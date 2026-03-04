//Ryan Dias de Souza
import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {

            double c1, c2, c3, c4;

            c1 = (double) (20 - 15) / 2;

            System.out.println("O resultado da (20-15)/2 é:  " + c1);

            c2 = (double) Math.pow(2, (5/20))+ 30 / Math.pow(15,2);
            System.out.println("O resultado de 2 ˆ (5/20) + 30 / (15 ˆ 2) é:  " + c2);

            c3 = (double)  35 / (6 + 2);
            System.out.println("O resultado de 35 / (6 + 2) é:  " + c3);

            c4 = (double) 23 % 4;
            System.out.println("O resultado de 23 / 4 é:  " + c4);

        }
    }
}
