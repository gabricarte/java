package gabi.aula05a;

public class Conta {
    //Atributos
    
     public int numConta;
     protected String tipo; 
     private String dono; 
     private float saldo; 
     private boolean status;  
     
     //Métodos personalizados
     public void EstadoAtual(){
         System.out.println("Conta: " + this.getNumConta());
         System.out.println("Dono: " + this.getDono());
         System.out.println("Tipo: " + this.getTipo());
         System.out.println("Saldo: " + this.getSaldo());
         System.out.println("Status: " + this.getStatus());
     }
     public void abrirConta(String t){
         this.setTipo(t);
         this.setStatus(true);
         
         if (t == "cc") {
             this.setSaldo(50);
             
         } else if (t == "cp"){
             this.setSaldo(150);
             
         }
         System.out.println("Conta aberta com sucesso! ");
     }
     
     public void fecharConta(){
         if (this.getSaldo() > 0) {
             System.out.println("Conta não pode ser fechada, pois ainda tem dinheiro. ");
         } else if (this.getSaldo() < 0){
             System.out.println("Conta não pode ser fechada, pois tem débito. ");
         } else {
             this.setStatus(false);
             System.out.println("Conta fechada com sucesso. ");
         }
         
     }
     
     public void depositar(float v){
         if (this.getStatus() == true) {
             // this.saldo = this.saldo + v; - Esse trabalha diretamente com os atributos 
             this.setSaldo(this.getSaldo() + v); //Esse trabalha com os métodos especiais 
             System.out.println("Depósito realizado com sucesso na conta de " + this.getDono());
         } else {
             System.out.println("Impossível depositar em uma conta fechada! ");
         }
     }
     
     public void sacar(float v){
         if (this.getStatus()) {
             if (this.getSaldo() >= v) {
                 this.setSaldo(this.getSaldo() - v);
                 System.out.println("Saque realizado com sucesso na conta!");
             } else {
                 System.out.println("Impossível sacar, saldo insuficiente. ");
             }
         } else {
             System.out.println("Impossível sacar de uma conta fechada.");
         }
     }
     
     public void pagarMensal(){
         int v = 0; //variável local, não um atributo
         
         if (this.getTipo() == "cc") {
             v = 12;
         } 
         else if(this.getTipo() == "cp") {
             v = 20;
         }
         if (this.getStatus()) {
             this.setSaldo(this.getSaldo() - v);
             System.out.println("Mensalidade paga com sucesso por " + this.getDono());
         } else {
             System.out.println("Impossível pagar uma conta fechada.");
         }
     }
     
     
     // Métodos especiais (Construtor, getters e setters//
     
     public Conta() //Construtor
     {
       this.setSaldo(0);  //Poderia ser assim, mas a preferência é ref setters e getters this.saldo = 0;
       this.setStatus(false); ///this.status = false; 
     }

     //Getters e setters 
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

     
}
     
     
