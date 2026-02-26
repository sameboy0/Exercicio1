import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//Ryan Dias de Souza
public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String nome, curso, Status_Aula;
        int Ra, idade;
        double altura;

        System.out.println("Insira o seu nome completo ");
nome = leitura.next();
        System.out.println("Insira o seu Ra ");
Ra= leitura.nextInt();
        System.out.println("Insira o seu Curso");
curso = leitura.next();
        System.out.println("Insira o sua idade ");
idade = leitura.nextInt();
        System.out.println("Insira o sua altura ");
altura = leitura.nextDouble();
        System.out.println("Insira o seu status da aula ");
        Status_Aula = leitura.next();
    }
}