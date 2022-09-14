
package gabi.aula12;


public class Ave extends Animal {
    
    //Atributos
    private String corPena; 
    
    //Métodos
    public void fazerNinho(){
        System.out.println("Construiu um ninho");
    }
    
    //Métodos abstratos implementados 

    @Override
    public void locomover() {
         System.out.println("Voando");
    }

    @Override
    public void alimentar() {
         System.out.println("Comendo frutas");
    }

    @Override
    public void emitirSom() {
         System.out.println("Som de ave");
    }
    
    //Getters and setters

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
}
