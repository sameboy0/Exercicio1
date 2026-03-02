import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)){

            String nome;
            double nota1,nota2, media;

            System.out.println("Insira o seu primeiro nome");
            nome = ler.next();
            System.out.println("Insira sua primeira nota");
            nota1 = ler.nextDouble();
            System.out.println("Insira sua segunda nota");
            nota2 = ler.nextDouble();

            media = (nota1 + nota2) /2;
            System.out.println("Media das notas: " + media);













        }








    }
}