
package gabi.aula06b;
    
public interface Controlador {
    public abstract void ligar(); // void porque ele não retorna nenhum parâmetro, ponto e vírgula no final pois ele é abstrato.
    public abstract void desligar();
    public abstract void abrirMenu();
    public abstract void fecharMenu();
    public abstract void maisVolume();
    public abstract void menosVolume();
    public abstract void ligarMudo();
    public abstract void desligarMudo();
    public abstract void play();
    public abstract void pause();
}
