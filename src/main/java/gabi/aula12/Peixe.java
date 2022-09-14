
package gabi.aula12;

public class Peixe extends Animal {
    
    //Atributos
    
    private String corEscama;
    
    //Métodos
    
    public void soltarBolha(){
        System.out.println("Soltou uma bolha");
    }
    
     //Métodos abstratos implementados 

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substâncias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");
    }
    
    //Getters and setters

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    
    
}
