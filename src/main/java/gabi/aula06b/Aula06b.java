
package gabi.aula06b;

public class Aula06b {
//Utilizando apenas os métodos abstratos disponíveis na interface. Os getters e setters na classe são privados. 
    
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto(); 
        c.ligar();
        c.play();
        c.maisVolume();
        c.abrirMenu();
    }
}
