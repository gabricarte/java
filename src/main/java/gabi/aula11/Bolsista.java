
package gabi.aula11;

// Bolsista é uma especialização de aluno. 
//Herança de diferença
//Bolsista só pode herdar de aluno pois aluno não é uma classe final. 

public class Bolsista extends Aluno {
    //Atributos
    private int bolsa; 
    
    // Métodos
    public void renovarBolsa(){
        System.out.println("Renovando bolsa de " + this.nome);
    }
    
    // Sobreposição do método pagarMensalidade da classe "Aluno": 
    
    @Override
    
    public void pagarMensalidade(){
        System.out.println(this.nome + " é bolsista! Pagamento facilitado");
    }
    
    //Getters e setters

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
    
}
