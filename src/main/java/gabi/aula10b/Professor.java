
package gabi.aula10b;

public class Professor extends Pessoa {
    
    // Atributos 
    
    private String especialidade; 
    private float salario; 
    
    //Métodos
    
    public void receberAum(int p){
        this.salario = p + this.salario; 
    }
    
    //Construtor 

    public Professor() {
        this.especialidade = "Matemática";
        this.salario =+ 1000;
    }

    // Detalhes
    @Override
    public String toString() {
        return "Professor{" + "especialidade=" + especialidade + ", salario=" + salario + '}';
    }
   
    
    //Getters and setters

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
}
