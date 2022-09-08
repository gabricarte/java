package gabi.aula10b;

public class Funcionario extends Pessoa {
    //Atributos
    private String setor;
    private boolean trabalhando; 
    
    //Métodos
    
    public void mudarTrabalho(String s){
        this.setor = s; 
    }
    
    //Getters and setters

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
    
}
