public class Caneta { // Declara a classe pública (estrutura básica que define o objeto)

    String modelo; // Declara atributo tipo String (texto) para guardar o modelo
    String cor; // Declara atributo tipo String (texto) para guardar a cor
    float ponta; // Declara atributo tipo float (número com vírgula) para guardar a ponta
    int carga; // Declara atributo tipo int (número inteiro) para guardar a carga
    boolean tampada; // Declara atributo tipo boolean (verdadeiro/falso) para guardar o estado
    
    void status(){ // Declara método sem retorno (void) para exibir o estado
        System.out.println(" Modelo: " + this.modelo); // Imprime texto no console + valor de modelo (this referencia a própria classe)
        System.out.println(" Uma caneta " + this.cor); // Imprime texto no console + valor de cor
        System.out.println(" Ponta: " + this.ponta); // Imprime texto no console + valor de ponta
        System.out.println(" Carga: " + this.carga); // Imprime texto no console + valor de carga
        System.out.println(" Esta tampada? " + this.tampada); // Imprime texto no console + valor booleano de tampada
    }

    void rabiscar(){ // Declara método sem retorno (void) para simular o rabisco
        if (this.tampada == true) { // Estrutura condicional (if): avalia se a condição entre parênteses é verdadeira
            System.out.println("ERRO! não posso executar a ação."); // Imprime mensagem de erro caso o 'if' seja verdadeiro
        } else { // Bloco alternativo (else): executa quando a condição do 'if' for falsa
            System.out.println("Rabiscando"); // Imprime confirmação caso o 'if' seja falso
        }
    }
    
    void tampar(){ // Declara método sem retorno (void) para tampar
        this.tampada = true; // Operador de atribuição (=): define o valor da variável tampada como verdadeiro (true)
    }

    void destampar(){ // Declara método sem retorno (void) para destampar
        this.tampada = false; // Operador de atribuição (=): define o valor da variável tampada como falso (false)
    }
}