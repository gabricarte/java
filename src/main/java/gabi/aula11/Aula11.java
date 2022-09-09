
package gabi.aula11;


public class Aula11 {

    public static void main(String[] args) {
        // Programa principal 
        /*
        Visitante v1  = new Visitante();
        v1.setIdade(19);
        v1.setNome("Gabriela");
        v1.setSexo("F");
        System.out.println(v1.toString());        
        */
        
        //Aluno 
        
        Aluno a1  = new Aluno(); 
        a1.setNome("Claudio");
        a1.setMatricula(1111);
        a1.setCurso("Informática");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensalidade();
        System.out.println(a1.toString());
        
        // Bolsista 
        Bolsista b1  = new Bolsista(); 
        b1.setNome("Fernando");
        b1.setMatricula(2222);
        b1.setCurso("Ciência da Computação");
        b1.setIdade(20);
        b1.setSexo("M");
        b1.setBolsa(12);
        System.out.println(b1.toString());
         b1.pagarMensalidade();       
        // Pessoa p1 = new Pessoa(); . Esse código da um erro, pois "Pessoa" é uma classe abstrata e não pode ser instanciada. 
        
        // Professor 
        Professor p1 = new Professor(); 
        p1.setNome("Guanabara");
        p1.setIdade(49);
        p1.setSalario(2930.50f);
        p1.setSexo("M");
        p1.receberAumento(524.50f);
        System.out.println(p1.toString());
        
        //Técnico
        Técnico t1 = new Técnico(); 
        t1.setNome("Meiri");
        t1.setIdade(40);
        t1.setMatricula(4545);
        t1.setCurso("Estética"); 
        t1.setBolsa(15);
        t1.setSexo("F");
        System.out.println(t1.toString());
        t1.praticar();
    }
}
