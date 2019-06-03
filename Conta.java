
package newconta;


public class Conta {
    
    protected double saldo;
 
    
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
      
        this.saldo = this.saldo * taxa;
        
    }
  
}