
package gabi.aula10b;


public class Aula10b {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(); 
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario(); 
        
        p2.setNome("Pedro");
        p2.setIdade(15);
        p2.setSexo("M");
        System.out.println(p2.toString());
        p2.setCurso("Informática");
       
        p3.receberAum(300);
        System.out.println(p3.toString());

    }
}
