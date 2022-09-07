
package gabi.aula09bt;


public interface Publicacao {
    // Métodos abstratos 
    // Os métodos abstratos não são desenvolvidos na interface
    // O método abstrato é previsto, mas não é implementado 
    
    public abstract void abrir();
    public abstract void fechar();
    public abstract void folhear(int p);
    public abstract void avançarPag();
    public abstract void voltarPag(); 
    
    // É necessário dizer que a classe  implementa determinada interface, colocar "implements Publicacao" no nome da classe Livro
    
}
