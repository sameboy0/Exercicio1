import java.util.Scanner;

//Ryan Dias de Souza
public class Atividade12 {
    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {

            double c1, c2, c3, c4;

            System.out.println("Escolha um número para ser elevado ao quadrado : ");
            c1 = ler.nextDouble();
            System.out.println("o resultado é : "+ Math.pow(c1,2));

            System.out.println("Escolha um número para ser elevado ao cubo : ");
            c2 = ler.nextDouble();
            System.out.println("O resultado é : " + Math.cbrt(c2));


            System.out.println("Escolha um número para fazer a raiz quadrada  : ");
            c3 = ler.nextDouble();
            System.out.println("O resultado é : "+ Math.sqrt(c3));

            System.out.println("Escolha um número para ser elevado a potência 10 : ");
            c4 = ler.nextDouble();
            System.out.println("O resultado é : "+ Math.pow(c4,10));


        }
    }
}