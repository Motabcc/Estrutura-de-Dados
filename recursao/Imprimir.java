package recursao;

public class Imprimir {

    public static class Node {
        public Object dado;
        public Node proximo;

        public Node(Object dado) {
            this.dado = dado;
            this.proximo = null;
        }
    }

    private Node primeiro;

    // Método público que inicia a impressão a partir do primeiro nó
    public void imprime() {
        imprimeRecursivo(primeiro);
    }

    // Método auxiliar recursivo
    private void imprimeRecursivo(Node p) {
        // Caso Base: se o nó atual for nulo, a lista chegou ao fim/condição de parada
        if (p == null) {
            System.out.println("fim da lista");
            return;
        }

        // Caso Passo: imprime o dado do nó atual e chama recursivamente para o próximo
        System.out.println(p.dado);
        imprimeRecursivo(p.proximo);
    }
}