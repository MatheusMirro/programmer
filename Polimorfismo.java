
package newconta;


public class Polimorfismo extends Conta{
    
    public static void main(String[] args) {
        
        Conta conta = new Conta();
        System.out.println(conta.getSaldo());
        
        Conta CP = new Conta();
        System.out.println(conta.getSaldo());
        
        Conta CC = new Conta();
        System.out.println(conta.getSaldo());
        
    }
    
}
