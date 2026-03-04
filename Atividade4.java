//Ryan Dias de Souza
import java.util.Scanner;
public class Atividade4 {
    public static void main(String[] args) {
try (Scanner ler= new Scanner(System.in) ){

    int num1, num2, num3, num4, resultado;

    System.out.println("Digite o seu primeiro número ");
    num1 = ler.nextInt();
    System.out.println("Digite o seu segundo número ");
    num2 = ler.nextInt();
    System.out.println("Digite o seu terceiro número ");
    num3 = ler.nextInt();
    System.out.println("Digite o seu quarto número ");
    num4 = ler.nextInt();

    resultado = num1 + num2 + num3 + num4;


    System.out.println("O soma dos seus números foram: " + resultado);




        }
    }
}
