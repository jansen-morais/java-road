package test;

public class Fone{

    private String modelo;
    private String tipo;
    private int bateria;
    private boolean fechado;

    public Fone (String m, String t){//metodo construtor 
        this.modelo = m;
        this.tipo = t;
        this.fechar();

    }

    public String getModelo (){ //aqui retorna o valor que vai estar contido na variavel 
        return this.modelo;
    }
    public void setModelo (String m){// esse capta o valor e armazena na variavel 
        this.modelo = m;
    }

    public String getTipo (){
        return this.tipo;
    }
    public void setTipo(String t){
        this.tipo = t;
    }

    public float getBateria(){
        return this.bateria;
    }
    public void setBateria(int p){
        this.bateria = p;
    }

    public void fechar (){
        this.fechado = true;
    }
    public void abrir (){
        this.fechado = false;
    }

    public void status (){
        System.out.println(" O modelo do fone é: " + this.modelo);
        System.out.println(" O tipo do fone é: " + this.tipo);
        System.out.println(" A bateria esta em: " + this.bateria + " %");
        System.out.println(" A Caixa do fone está fechada?: " + this.fechado);
    }




}
