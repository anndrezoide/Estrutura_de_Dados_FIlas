package Fila;
public class Teste {
    public static void main(String[] args) {
        Fila f1 = new Fila();
        f1.adiciona(1);
        f1.adiciona(2);
        f1.adiciona(3);
        f1.adiciona(51);
        f1.adiciona(60);
        f1.remove();
        f1.adiciona(75);
        f1.adiciona(76);
        f1.adiciona(15);
        f1.adiciona(9);
        f1.adiciona(80);
        f1.adiciona(8);
        f1.remove();
        f1.adiciona(100);
        f1.imprime();
        System.out.println("Qtd de Elementos:  " + f1.tamanho());
    }
}
