
package testephyton;

import java.util.Scanner;


public class TestePhyton {

    
    public static void main(String[] args) {
        
        Scanner leitura = new Scanner(System.in);
        int idade, dia, ano, res;
        String nome, mes;
        
        System.out.println("Qual seu nome? ");
        nome = leitura.next();
        
        System.out.println("Vamos agora analizar sua idade!");
        
        System.out.println("Qual o dia do seu nascimento?");
        dia = leitura.nextInt();
        
        System.out.println("Qual mês do seu nascimento? ");
        mes = leitura.next();
        
        System.out.println("Qual o ano do seu nascimento? ");
        ano = leitura.nextInt();
        
        System.out.println("Olá " + nome + ", você nasceu no dia " + dia + " de "+ mes +" de "+ano+ ". Correto? ");
        
        res = (2019) - (ano);
        
        
        System.out.println("Portanto sua idade é: " +res +" anos. ");
     
    }
    
}
