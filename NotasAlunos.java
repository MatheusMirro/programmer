
package notasalunos;

import java.util.Scanner;


public class NotasAlunos {

    
        public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        String nome;

        String nome2;

        String nome3;
        
        System.out.println("Informe o nome do aluno: ");

        nome = entrada.next() ;

        System.out.println("Informe a nota do aluno "+nome);

        double nota = entrada.nextDouble();

        System.out.println("Informe o nome do aluno: ");
        
        nome2 = entrada.next();
    
        System.out.println("Informe a nota do aluno  "+nome2);
        
        double nota2 = entrada.nextDouble();

        System.out.println("Informe o nome do aluno: ");
        
        nome3 = entrada.next() ;

        System.out.println("Informe a nota do aluno "+nome3);

        double nota3 = entrada.nextDouble();

       
if(nota > nota2 && nota > nota3){
    
System.out.println("A maior nota e a de "+nome+", que tirou "+nota);
}else{

if(nota2 > nota && nota2 > nota3){
    
System.out.println("A maior nota e a de "+nome2+", que tirou "+nota2);
}else{

System.out.println("A maior nota e a de "+nome3+", que tirou "+nota3); 
}
}
}

}

