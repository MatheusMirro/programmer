package salariominimo;

import java.util.Scanner;

public class SalarioMinimo {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        int salario, salmin = 788, div;

        System.out.println("Digite seu salario para saber quantos salarios minimos você recebe: ");
        salario = leitura.nextInt();

        div = salario / salmin;

        System.out.println("Atualmente você recebe " + div + " salarios minimos.");

    }

}
