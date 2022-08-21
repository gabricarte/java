
package gabi.aula06b;

public class ControleRemoto implements Controlador {

    //Atributos
    private int volume; 
    private boolean ligado;
    private boolean tocando;
    
    //Métodos especiais 
    
    //Método Construtor 
    
    public ControleRemoto() {    
        this.setVolume(50);
        this.setLigado(false);
        this.setTocando(false);   
    }

    // Getters e setters para os atributos privados
    
    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
   
    //Métodos abstratos

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override //Significa que o método abstrato já estava definido, e agora está sendo sobrescrito. Desconsiderando a programação que não tinha sido feita na interface.  
    public void desligar() {
         this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("--------- MENU --------- ");
        System.out.println("Está ligado?" + this.getLigado());
        System.out.println("Está tocando?" + this.getTocando());
        System.out.println("Volume: " + this.getVolume());
        
        //Laço de repetição que mostra uma barrinha a cada 10 de volume
        
        for (int i = 0; i < this.getVolume(); i+=10) // início; enquanto; passo. (+= Ganha ele mesmo) 
        {
            System.out.print("|");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()) // Se verdadeiro
        {
            this.setVolume(this.getVolume() + 10);
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() - 10);
        } 
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0) // Duas condições = &&
        {
            this.setVolume(0);
        } 
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !this.getTocando()) // o "!" Na frente indica negação.
        {
            this.setTocando(true);
        } 
    }

    @Override
    public void pause() {
        if ( this.getLigado() && this.getTocando()) {
            this.setTocando(false);
        }
    }
}
