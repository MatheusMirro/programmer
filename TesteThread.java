package exerciciothreads;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TesteThread {

    public static void main(String[] args) throws InterruptedException {
        Scanner leitura = new Scanner(System.in);

        String boleto;

        int time;

        int pagarFla = 0;

        int pagarFogo = 0;

        String cartao;

        int comprar, comprarBilhete, numeroAgencia, numeroConta, numeroSeguranca;

        System.out.println("SEJA BEM VINDO À COMPRA DE BILHETES PARA O JOGO ENTRE BOTAFOGO X FLAMENGO!");

        System.out.println("PARA COMEÇAR, SELECIONE SEU TIME!");

        System.out.println(" 1 - Botafogo de Futebol e Regatas");

        System.out.println(" 2 - Clube de Regatas do Flamengo");
        comprar = leitura.nextInt();

        if (comprar == 1) {

            System.out.println("SELECIONE ABAIXO A FORMA DE PAGAMENTO: ");

            System.out.println("1 - Boleto bancário ");
            System.out.println("2 - Cartão de crédito ");
            pagarFogo = leitura.nextInt();

        }
        if (pagarFogo == 2) {

            System.out.println("Digite os numero da agência: ");
            numeroAgencia = leitura.nextInt();
            System.out.println("Digite os numeros da conta: ");
            numeroConta = leitura.nextInt();
            System.out.println("Digite os codigos três de segurança: ");
            numeroSeguranca = leitura.nextInt();

            System.out.println("Parabéns, compra aprovada!");
            

        }
        if (comprar == 2) {

            System.out.println("SELECIONE ABAIXO A FORMA DE PAGAMENTO: ");

            System.out.println("1 - Boleto bancário ");
            System.out.println("2 - Cartão de crédito ");
            pagarFla = leitura.nextInt();

        }
        if (pagarFla == 2) {

            System.out.println("Digite os numero da agência: ");
            numeroAgencia = leitura.nextInt();
            System.out.println("Digite os numeros da conta: ");
            numeroConta = leitura.nextInt();
            System.out.println("Digite os codigos três de segurança: ");
            numeroSeguranca = leitura.nextInt();

           System.out.println("Parabéns, compra aprovada!");

        }

        MinhaThread comprador1 = new MinhaThread("Comprador 1");
        MinhaThread comprado2 = new MinhaThread ("Comprador 2");

        Date data = new Date();
        SimpleDateFormat formatacao = new SimpleDateFormat("dd/MMMM/yyy  HH:mm:ss");
        String dataFormatada = formatacao.format(data);
        System.out.println("Data e hora da compra dos bilhetes: " + dataFormatada);

    }

}
