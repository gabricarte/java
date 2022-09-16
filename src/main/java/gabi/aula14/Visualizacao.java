package gabi.aula14;

public class Visualizacao {
    
    //Classe para fazer o gafanhoto assistir o vídeo 
    
    
    //Atributos. Relacionamento entre classes de agregação 
    private Gafanhoto espectador; // Atributos "espectador" e "filme" são instâncias de outras classes  
    private Vídeo filme; 
    
    
    //Métodos
    
    //Construtor
    
    public Visualizacao(Gafanhoto espectador, Vídeo filme) {    
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido()+1);
        this.filme.setViews(this.filme.getViews()+1);
    }

    //Sobrecarga do método "avaliar"
    
    public void avaliar() {
        this.filme.setAvaliacao(5);
    }
    
    public void avaliar(int nota) {
        this.filme.setAvaliacao(nota);
    }
    
    public void avaliar(float porc) {
        
        int tot = 0; 
        if (porc <= 20) {
            tot = 3; 
        } else if (porc <= 50){
            tot = 5; 
        } else if (porc <= 90){
            tot = 8;
        } else {
            tot = 10; 
        }
        this.filme.setAvaliacao(tot);
    } 
    
    //Getters and setters

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Vídeo getFilme() {
        return filme;
    }

    public void setFilme(Vídeo filme) {
        this.filme = filme;
    }
    
    //toString

    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }
    
    
}
