
package gabi.aula12;


public class Aula12 {

    public static void main(String[] args) {
  
        //Programa principal 

        /*
        Mamifero m = new Mamifero(); 
        Reptil r = new Reptil();
        Peixe p = new Peixe(); 
        Ave a = new Ave(); 
        
        //Mamífero 
        m.setPeso(85.3f);
        m.setIdade(2);
        m.setMembros(4);
        m.alimentar();
        m.locomover();
        m.alimentar();
        m.emitirSom();
        
        //Peixe 
        p.setPeso(0.35f);
        p.setIdade(1);
        p.setMembros(0);
        p.alimentar();
        p.locomover();
        p.alimentar();
        p.emitirSom();
        
        
        Polimorfismo de sobreposição
        
        Foi chamado o mesmo método com o mesmo nome, e foi obtido formas diferentes de resposta.
        Os métodos abstratos foram sobrepostos.
 
        Mamifero m2 = new Mamifero(); 
        Canguru c = new Canguru(); 
        Cachorro k = new Cachorro(); 
        
        c.setPeso(55.30f);
        c.setIdade(3);
        c.setMembros(4);
        c.locomover();
        c.alimentar();
        c.emitirSom();
        c.usarBolsa();
               */
        
        Cachorro c1 = new Cachorro(); 
        c1.reagir("olá");
        c1.reagir(11, 45);
        c1.reagir(13,00);
        c1.reagir(true);
        c1.reagir(false);
        c1.reagir(2, 12.5f);
    }
}
