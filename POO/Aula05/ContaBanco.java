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
        this.status = false;
        this.fecharConta(); 
    }
// Metodos especiais 
    public void setNumConta(int n){
        numConta = n;
    }
    public int getNumConta (){// O metodo "get" não precisa resseber parametros 
        return this.numConta;
    }

    public void setTipo (String t){
        tipo = t;
    }
    public String getTipo (){
        return  this.tipo;
    }

    public void setDono (String d){
        dono = d;
    }
    public String getDono (){
        return this.dono;
    }

    public void setSaldo (float s){
        saldo = s;
    }
    public float getSaldo (){
        return  this.saldo;
    }

    public void setStatus(boolean s){
        status = s;
    }
    public boolean getStatus(){
        return this.status;
    }

    
// Metodos de ação     
    public void abrirConta(String t){
        setTipo(t);
        setStatus(true);
        if (t == "CC") {//o ideal em Java para comparar texto (String) é usar t.equals("CC") em vez de t == "CC"
            saldo = 50;
        } else if (t == "CP") {
            saldo = 150;
        }
        


    }
    public void fecharConta(){
        if (saldo > 0){
            System.out.println(" A conta tem saldo!");
        } else if (saldo < 0){
            System.out.println(" A conta esta em debito");
        } else {
            setStatus(false);
        }

    }
    public void depositar (){

    }
    public void sacar (){

    }
public void pagarMensal(){


}




}
