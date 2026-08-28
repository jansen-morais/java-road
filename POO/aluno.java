public class aluno {
    private String nome; 
    public void inserirNome(String nn) {
        nome = nn;
    }
    public String recuperarNome() {
        return nome;
    }
    public static void main(String args[]){
        aluno a = new aluno(); 
        a.inserirNome ("Pessoa");
        System.out.println("saida: "+a.recuperarNome());
    }
} 
