
package orientacaoobjeto;



public class Caneta {
    
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        
        System.out.println("Uma caneta: "+this.cor);
        System.out.println("Ponta: "+this.ponta);
        System.out.println("Está tampada? "+this.tampada);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Quantidade de carga em ML: "+this.carga);
    }
    void rabiscar(){
        if (this.tampada == true){
            System.out.println("Erro! Não posso rabiscar");
        }else{
            System.out.println("Rabisca!");
        }
        
    }
    
    void tampar(){
        this.tampada = true;
        
    }
    
    void destampar(){
        this.tampada = false;
        
    }
    
    
}

