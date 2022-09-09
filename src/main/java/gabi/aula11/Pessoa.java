
package gabi.aula11;

// Classe abstrata

public abstract class Pessoa {
    
    //Atributos 
    
    protected String nome; 
    private int idade; 
    private String sexo; 
    
    // Métodos
    
    public void fazerAniv(){
        this.idade++; 
    }
    
    //To string

    @Override
    public String toString() {
        return "Dados{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }
    
    
    // Getters e setters 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
}
