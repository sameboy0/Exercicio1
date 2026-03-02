import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       try (Scanner ler = new Scanner(System.in)) {

           Double valor1, valor2, resultado;

           System.out.println("Insira o primeiro valor");
           valor1 = ler.nextDouble();
           System.out.println("Insira seu segundo valor");
           valor2= ler.nextDouble();

           resultado = (valor1 * valor2);
           System.out.println("O seu resultado é: " + resultado);



       }



    }
}