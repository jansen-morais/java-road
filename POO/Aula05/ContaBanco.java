package Aula05;

public class ContaBanco {
    
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
//Metodo construtor
    public ContaBanco (){
        this.saldo = 0;
        this.fecharConta(); 
    }

    public void setNumConta(int n){
        numConta = n;
    }
    public int getNumConta (){
        return this.numConta;
    }

    
// Metodos de ação     
    public void abrirConta(){

    }
    public void fecharConta(){

    }
    public void depositar (){

    }
    public void sacar (){

    }
public void pagarMensal(){

}




}
