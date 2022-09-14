package gabi.aula12;

// Progenitora, abstrata (não pode ser um objeto) 

public abstract class Animal {
    
    //Atributos
    
    private float peso; 
    private int idade; 
    private int membros; 
    
    //Métodos abstratos. Implementados, mas não desenvolvidos na progenitora e sim nas classes filhas. 
    
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
    
    // Getters and setters

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
    
}
