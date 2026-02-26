import java.util.Scanner;
//Ryan Dias de Souza
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int num1, num2;
        System.out.println("Digite um número inteiro");
        num1 = ler.nextInt();
        System.out.println("Digite um número inteiro");
        num2 = ler.nextInt();

        System.out.println("Os números que você escolheu foram: "+num1);
        System.out.println("E: "+num2);
    }
}