package arvoresbin;

class Node {
    public int chave;
    public int dado;
    public Node direita;
    public Node esquerda;

    public Node(int chave, int dado) {
        this.chave = chave;
        this.dado = dado;
        this.direita = null;
        this.esquerda = null;
    }
}

public class ArvoreBin {
    Node raiz;

    public void insereAbin(int chave, int dado) {
        Node novo = new Node(chave, dado);
        if (this.raiz == null) {
            this.raiz = novo;
        } else {
            Node p = this.raiz;
            Node q = null;
            while (p != null) {
                q = p;
                if (chave < p.chave) {
                    p = p.esquerda;
                } else {
                    p = p.direita;
                }
            }
            if (chave < q.chave) {
                q.esquerda = novo;
            } else {
                q.direita = novo;
            }
        }
    }

    public Node encontrarElemento(int chave) {
        Node p = this.raiz;
        while (p != null) {
            if (p.chave == chave) {
                return p;
            }
            if (chave < p.chave) {
                p = p.esquerda;
            } else {
                p = p.direita;
            }
        }
        return null;
    }

    public Node menorElemento() {
        if (this.raiz == null) {
            return null; // Árvore vazia
        }
        Node p = this.raiz;
        while (p.esquerda != null) {
            p = p.esquerda;
        }
        return p;
    }

    public Node maiorElemento() {
        if (this.raiz == null) {
            return null; // Árvore vazia
        }
        Node p = this.raiz;
        while (p.direita != null) {
            p = p.direita;
        }
        return p;
    }

    public void preOrdem(Node atual) {
        if (atual != null) {
            System.out.println("Chave: " + atual.chave + " | Dado: " + atual.dado);
            preOrdem(atual.esquerda);
            preOrdem(atual.direita);
        }
    }

    public void posOrdem(Node atual) {
        if (atual != null) {
            posOrdem(atual.esquerda);
            posOrdem(atual.direita);
            System.out.println("Chave: " + atual.chave + " | Dado: " + atual.dado);
        }
    }
}