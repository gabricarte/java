
package gabi.aula14;

// Programa Principal

public class Aula14 {

    public static void main(String[] args) {
       

        Vídeo v[] = new Vídeo[3]; 
        v[0] = new Vídeo ("Java Introdução");
        v[1] = new Vídeo ("Java Intermediário");
        v[2] = new Vídeo ("Java Avançado");
        

        Gafanhoto g[] = new Gafanhoto[2]; 
        g[0] = new Gafanhoto("Gabi", 19, "F", "LOGIN1", 2); 
        g[1] = new Gafanhoto("Leya", 20, "F", "LOGIN2", 3); 

        
        Visualizacao vis[] = new Visualizacao[2];
        vis[0] = new Visualizacao(g[0], v[0]); 
        System.out.println(vis[0].toString());
        
        vis[1] = new Visualizacao(g[0], v[1]); 
        vis[1].avaliar();
        System.out.println(vis[1].toString());
    } 
}