
package gabi.aula11;

//Sub-classe de "Pessoa". 
// Pessoa é uma generalização de Aluno. 
//Herança de diferença 

public class Aluno extends Pessoa {
    
    // Atributos
    private int matricula; 
    private String curso; 
    private int bolsa; 
    
    // Métodos
    // public final void// nesse caso, daria erro na classe "bolsista", já que a classe progenitora possui o método final que não ser sobrescrito 
    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade de aluno... " + this.nome); //É possível utilizar o método "this.nome", pois ele está "protegido" na classe "Pessoa"
    }
    
    // Getters e setters

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }


    
 
}
