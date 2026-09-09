public class Aula02 { // Declara a classe pública 'Aula02' (a classe executável do programa)
    public static void main(String[] args){ // Declara o método principal 'main' (ponto de entrada por onde o Java inicia a execução)
        Caneta c1 = new Caneta(); // Instancia o primeiro objeto 'c1' da classe 'Caneta' usando o operador 'new' (reserva espaço na memória)
        c1.modelo = "Bic"; // Atribui o texto "Bic" diretamente ao atributo 'modelo' do objeto 'c1' através do operador ponto (.)
        c1.cor = "Azul"; // Atribui o texto "Azul" ao atributo 'cor' do objeto 'c1'
        //c1.ponta = 0.5f; // Atribui o número float 0.5 ao atributo 'ponta' de 'c1' (o sufixo 'f' indica o tipo float)
        c1.carga = 90; // Atribui o número inteiro 90 ao atributo 'carga' de 'c1'
        //c1.tampada = false; //traz o estatus -> Linha comentada (ignorada pelo compilador): alteraria diretamente a variável booleana de 'c1'
        c1.tampar(); // Chama o método 'tampar()' do objeto 'c1', alterando seu atributo 'tampada' para true
        //c1.destampar(); -> Linha comentada: se executada, chamaria o método para mudar 'tampada' para false
        c1.status(); // Chama o método 'status()' do objeto 'c1' para imprimir no console todos os seus atributos atuais
        c1.rabiscar(); // Chama o método 'rabiscar()' do objeto 'c1' para testar a verificação de estar tampada ou não

        // caneta 2 usa os mesmo atributos já descritos para caneta porem com valores diferentes -> Comentário explicando o próximo bloco
        Caneta c2 = new Caneta(); // Instancia um segundo objeto 'c2' independente da classe 'Caneta' na memória
        c2.modelo = "Lever"; // Atribui o texto "Lever" ao atributo 'modelo' do objeto 'c2'
        c2.cor = "Preta"; // Atribui o texto "Preta" ao atributo 'cor' do objeto 'c2'
        //c2.ponta = 0.7f; // Atribui o número float 0.7 ao atributo 'ponta' de 'c2'
        c2.carga = 98; // Atribui o número inteiro 98 ao atributo 'carga' de 'c2'
        c2.destampar(); // Chama o método 'destampar()' do objeto 'c2', alterando seu atributo 'tampada' para false
        c2.status(); // Chama o método 'status()' do objeto 'c2' para exibir seus dados no console
        c2.rabiscar(); // Chama o método 'rabiscar()' do objeto 'c2' (como foi destampada, este executará a escrita)
    } // Fecha o escopo do método principal 'main'
} // Fecha o escopo da classe 'Aula02'