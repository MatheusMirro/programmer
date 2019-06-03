
package newconta;


public class ContaCorrente extends Conta {
    
    
    public double getSaldo() {
        return saldo;
    }
    
    void deposita (double quantidade){
        this.saldo += quantidade - 0.10;
        
    }
    void saca (double quantidade){
        double novoSaldo = this.saldo - quantidade;
        this.saldo = novoSaldo;
    }
    void atualiza (double taxa){
      
        this.saldo = this.saldo * 0.20;
        
    }
    
}
