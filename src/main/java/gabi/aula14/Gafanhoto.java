package gabi.aula14;

public class Gafanhoto extends Pessoa{
    
    //Atributos
    
    private String login; 
    private int totAssistido; 
    
    //Métodos
    public void viuMaisUm(){
       this.totAssistido++;
    }
    
    //Construtor. Pessoa é a superclasse, tem que ter nome, idade e sexo. Gafanhoto como herda de pessoa, também tem que passar estes parâmetros

    public Gafanhoto(String nome, int idade, String sexo, String login, int totAssistido) {
        super(nome, idade, sexo);
        this.login = login; 
        this.totAssistido = 0; 
    }
    //toString

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() + "\nlogin=" + login + ", totAssistido=" + totAssistido + '}';
    }
    
    
    //Getters and setters 

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    
}
