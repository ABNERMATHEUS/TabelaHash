package com.company;

public class NodeTabela {

    private int informacao;
    private  Lista lista ;



    public int getInformacao() {
        return informacao;
    }

    public void setInformacao(int informacao) {
        this.informacao = informacao;
    }
    public void insereLista(int elemento){
        if(lista == null){
            lista = new Lista();
        }
        lista.insereUltimo(elemento);
    }

    public void imprimir (){
        if(getInformacao() == -1){
            System.out.print("-1");

        }else
        System.out.print(getInformacao());
        System.out.print("  -  ");
        if(lista != null){
            lista.imprime();
        }

        System.out.print("\n  ");
    }

    public boolean getInfoLista(int chave){
        return  lista.getInfoLista(chave);
    }







}
