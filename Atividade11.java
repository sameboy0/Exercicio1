import java.util.Scanner;

//Ryan Dias de Souza
public class Atividade11 {
    public static void main(String[] args) {
    try (Scanner ler = new Scanner(System.in)){

        int anoN, anoA, idadeA, idade2030;

        System.out.println("Insira o ano de nascimento : ");
        anoN = ler.nextInt();
        System.out.println("Insira o ano atual : ");
        anoA = ler.nextInt();

        idadeA = anoA - anoN;
        idade2030 = 2030 - anoN;

        System.out.println("Idade da pessoa é : " + idadeA);
        System.out.println("Idade da pessoa em 2030 é : " + idade2030);




    }
}
}