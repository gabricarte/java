package gabi.aula11;


public class Técnico extends Aluno{
    
    //Atributos
    private int registroProfissional; 
    
    //Métodos
    public void praticar(){
        System.out.println("O aluno " + this.nome + " está praticando o ensino técnico");
    }
    
    //Getters and setters

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    
}
