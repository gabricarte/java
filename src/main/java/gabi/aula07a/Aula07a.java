
package gabi.aula07a;


public class Aula07a {

    public static void main(String[] args) {
        
        //Programa principal, cadastro de jogadores. 
       
        Lutador l[] = new Lutador[6];  // criar um vetor de 0 a 5, devido ao índice(para criar 6 lutadores) 
        
        l[0] = new Lutador("Pretty boy", "França", 31, 1.57f, 58.9f, 11, 2, 1);
        
        l[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3); 
        
        l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1); 
        
        l[3] = new Lutador("Deadcode", "Austrália", 28, 1.93f, 81.f, 13, 0, 2); 
        
        l[4] = new Lutador("UF0Cobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
        
        l[5] = new Lutador("Nerdaart", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
 
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[0], l[1]);
        UEC01.lutar();
    }
}
