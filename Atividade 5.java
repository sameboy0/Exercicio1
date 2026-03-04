


 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
try (Scanner ler = new Scanner(System.in)){

    double num1, num2, num3, resultado;

    System.out.println("Nota 1");
num1 = ler.nextDouble();
    System.out.println("Nota 2");
    num2 = ler.nextDouble();
    System.out.println("Nota 3");
    num3 = ler.nextDouble();

    resultado = (num1 + num2 + num3)/3;

    System.out.println("A média das notas são: " + resultado);



        }
    }
}