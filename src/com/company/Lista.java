package com.company;

public class Lista {


    private Node inicio;

    public Lista() {
        this.inicio = null;
    }

    public void insereUltimo(int elemento) {
        Node nova = new Node();
        nova.setInformacao(elemento);
        nova.setProximo(null);


        if (inicio == null) {
            inicio = nova;
        } else {
            Node aux;
            aux = inicio;
            while (aux.getProximo() != null) {
                aux = aux.getProximo();
            }
            aux.setProximo(nova);
        }

    }


    public Node removePrimeiro() {
        Node aux = inicio;
        inicio = inicio.getProximo();
        return aux;
    }

    public Node removeUltimo() {
        Node aux = inicio;
        Node anterior = aux;
        while (aux.getProximo() != null) {
            anterior = aux;
            aux = aux.getProximo();
        }
        anterior.setProximo(null);

        return aux;
    }

    public int topo() {
        Node aux = inicio;
        Node anterior = aux;
        while (aux.getProximo() != null) {
            anterior = aux;
            aux = aux.getProximo();
        }

        return aux.getInformacao();
    }

    public int InserePrimeiro(int elemento) {
        Node nova = new Node();
        nova.setInformacao(elemento);
        nova.setProximo(inicio);
        inicio = nova;
        return nova.getInformacao();
    }

    public void imprime() {

        if (inicio != null) {
            Node aux = inicio;
            if (vazia()) {
                System.out.println("Vazia");
                return;
            }
            while (aux != null) {
                System.out.print(aux.getInformacao());
                aux = aux.getProximo();
            }
        }

    }

    public boolean vazia() {
        return this.inicio == null;
    }


    public Node remover(Node no) {
        Node aux = inicio;
        inicio = no;
        return aux;
    }

    public int length() {
        if (inicio != null) {
            Node aux = inicio;
            int cont = 0;
            while (aux != null) {
                cont++;
                aux = aux.getProximo();
            }
            return cont;
        }
        return -1;
    }

    public void insereOrdenado(int elemento) {
        Node nova = new Node();
        nova.setInformacao(elemento);
        Node aux = inicio;
        Node anterior;
        Node proximo;

        while (aux.getProximo() != null) {
            if (aux.getInformacao() < nova.getInformacao()) {
                anterior = aux;
                proximo = anterior.getProximo();
                anterior.setProximo(nova);
                nova.setProximo(proximo);
                aux = aux.getProximo();
            } else {
                aux = aux.getProximo();
            }
        }


    }

    public boolean getInfoLista(int chave ){

        if (inicio != null) {
            Node aux = inicio;
            if (vazia()) {
               return false;
            }
            while (aux != null) {

                if(aux.getInformacao() == chave){
                    return true;
                }else{
                    aux = aux.getProximo();
                }

            }
        }
        return false;

    }


}
