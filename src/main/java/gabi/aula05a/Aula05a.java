
package gabi.aula05a;

public class Aula05a {
    
    public static void main(String[] args) {
        //Jubileu 
        Conta p1 = new Conta();
        p1.setNumConta(11111);
        p1.abrirConta("cp");
        p1.setDono("Jubileu");
        p1.depositar(300);
        p1.EstadoAtual();
        
        //Creusa
        Conta p2 = new Conta();
        p2.setNumConta(22222);
        p2.abrirConta("cc");
        p2.setDono("Creusa");
        p2.depositar(500);
        p2.sacar(100);
        p2.EstadoAtual();
    }
}
