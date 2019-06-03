
package newconta;


public class ContaPoupanca extends Conta {
    
    
    public double getSaldo() {
        return saldo;
    }
    
    void deposita (double quantidade){
        this.saldo += quantidade;
        
    }
    void saca (double quantidade){
        double novoSaldo = this.saldo - quantidade;
        this.saldo = novoSaldo;
    }
    void atualiza (double taxa){
      
        this.saldo = this.saldo * taxa * 0.30;
        
    }
    
}
