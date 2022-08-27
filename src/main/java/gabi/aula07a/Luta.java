
package gabi.aula07a;

import java.util.Random;


public class Luta {
    
    //Atributos
    
    private Lutador desafiado; 
    private Lutador desafiante; //Ao invés de String, foi utilizada a classe "Lutador".  
    private int rounds;
    private boolean aprovada; 

    //Métodos públicos
    
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) 
        {
            this.aprovada = true;
            this.desafiado = l1; 
            this.desafiante = l2; 
        } else {
            this.aprovada = false; 
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    
    public void lutar(){
        
        if (this.aprovada) 
        {
            System.out.println("Desafiado: ");
            this.desafiado.apresentar();
            System.out.println("Desafiante: ");
            this.desafiante.apresentar();
            
            //Para decidir quem irá ganhar a luta será usada a classe "Random" do Java. 
            
            Random aleatorio = new Random();
            
            int vencedor = aleatorio.nextInt(3); // 0 1 2 
            
            //Switch case, onde é obrigatório tem um "break" em caso.
            
            switch(vencedor){
                case 0:  // Empate
                   
                    System.out.println("Empatou! ");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                    
                case 1: // Desafiante
                    System.out.println("Vitória do " + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break; 
                    
                case 2: //Desafiado
                    System.out.println("Vitória do " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
            }
        } else {
            System.out.println("A luta não pode ocorrer");
        }
    }
    
    //Métodos especiais - Getters e setters. 

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}
