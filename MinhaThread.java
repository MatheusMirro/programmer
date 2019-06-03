package exerciciothreads;

import java.util.Scanner;

public class MinhaThread {

    Scanner leitura = new Scanner(System.in);

    String bilhete;

    public MinhaThread(String bilhete) throws InterruptedException {

        this.bilhete = bilhete;
        
        run();


    }

    public void comprar(String boleto, String cartao) {

        this.comprar(boleto, cartao);

    }

    public void run() throws InterruptedException {

        try {

             

            for (int i = 1; i < 21; i++) {
                int numeroAleatorio = (int) (20 + Math.random() * 100);

                System.out.println(" Comprador  " + i + " bilhete comprado com sucesso! Numero do bilhete: " + numeroAleatorio);

                Thread.sleep(600);

            }
            System.out.println("Bilhetes indisponiveis, tente novamente mais tarde!");

        } catch (RuntimeException e) {

        }

    }

}
