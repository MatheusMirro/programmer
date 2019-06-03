package comparar;

import java.util.Scanner;

public class Comparar {

    public static void main(String[] args) {

        int a, b;

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        a = leitura.nextInt();

        System.out.println("Digite o segundo valor: ");
        b = leitura.nextInt();

        if (a == b) {

            System.out.println("Os numeros são iguais!");

        } else {

            System.out.println("Os numeros são diferentes!");
        }
        if (a > b) {
            System.out.println("O primeiro valor é maior !");

        } else if (a == b) {
            System.out.println("Não existe valor maior, eles são numeros iguais!");
        }
        if (b > a) {
            System.out.println("O segundo valor é maior !");
        }

    }

}
