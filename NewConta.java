
package newconta;


public class NewConta {

   
    public static void main(String[] args) {
        
        Conta conta = new Conta();
        conta.deposita(100);
        conta.atualiza(1.0);
        System.out.println("Conta: "+conta.getSaldo());
        
        Conta CC = new ContaCorrente();
        CC.deposita(100);
        CC.atualiza(1.0);
        System.out.println("Conta Corrente: "+CC.getSaldo());
        
        Conta CP = new ContaPoupanca();
        CP.deposita(100);
        CP.atualiza(1.0);
        System.out.println("Conta Poupança: "+CP.getSaldo());
        
    }
    
}
