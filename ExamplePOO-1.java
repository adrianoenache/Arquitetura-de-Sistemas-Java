// Importação de bibliotecas padrão do Java
import java.util.*;
import java.lang.*;
import java.io.*;

/**
 * Classe Produto que representa um item no sistema de estoque.
 * Contém atributos para armazenar informações sobre um produto.
 */
class Produto {
    // Nome do produto
    String nome;
    // Preço do produto em reais
    double preco;
    // Quantidade disponível em estoque
    int quantidade;
    // Indica se o produto está disponível para venda
    boolean disponivel;
}

/**
 * Classe Main - contém o método principal do programa.
 * Demonstra o uso da classe Produto com um exemplo prático.
 */
class Main {
    // Método principal - ponto de entrada do programa
    public static void main(String[] args) {

        // Cria uma instância da classe Produto
        Produto comida1 = new Produto();

        // Inicializa os atributos do produto
        comida1.nome = "Arroz";
        comida1.preco = 25.50;
        comida1.quantidade = 0;

        // Verifica se há quantidade disponível em estoque
        if (comida1.quantidade > 0) {

            // Se houver estoque, marca o produto como disponível
            comida1.disponivel = true;
            System.out.println("Status: Produto disponível");

            // Verifica o nível de estoque
            if (comida1.quantidade <=5) {
                System.out.println("Estoque: baixo");

            } else if (comida1.quantidade <= 20) {
                System.out.println("Estoque: normal");

            } else {
                System.out.println("Estoque: Alto");
            }

        } else {
            // Se não houver estoque, marca como indisponível
            comida1.disponivel = false;
            System.out.println("Status: Produto indisponível (Sem estoque)");
        }

        // Exibe as informações do produto
        System.out.println("Produto: " + comida1.nome);
        System.out.println("Preço: R$ " + comida1.preco);
        System.out.println("Quantidade: " + comida1.quantidade);
        System.out.println("Disponível: " + comida1.disponivel);

    }

}
