package com.company;

import java.util.Random;

public class TabelaHash {
    private int colisao;
    private NodeTabela tabela [];
    private  Random random;
    public TabelaHash(int elemento) {
        random = new Random();
        this.tabela = new NodeTabela[elemento];
        colisao = 0;
        preencher(0);
        preencherRandom(0);
    }

    /* preencher a tabela com numeros com -1, que é considerado vazio*/
    private void preencher(int increment) {
        if (increment >= tabela.length)
            return;
        else {
            NodeTabela nodeTabela = new NodeTabela();
            nodeTabela.setInformacao(-1);

            tabela[increment] = nodeTabela;
            increment++;
            preencher(increment);
        }
    }

    /*preencher 90% da tabela com numeros aleatorios*/
    private void preencherRandom(int increment) {
        if (increment >= tabela.length*90/100)
            return;

        else {
            insere(random.nextInt(1000000));
            increment++;
            preencherRandom(increment);
        }
    }

    /*insere no atributo info, se caso houver colisao, insere na lista*/
    public void insere(int chave){

        int hash = funcaoHash(chave);
        if(tabela[hash].getInformacao() == -1){
            tabela[hash].setInformacao(chave);
        }else{
            colisao++;
            tabela[hash].insereLista(chave);
        }

    }

    /*cria o hash*/
     int funcaoHash(int chave){
        return chave % tabela.length;
    }

    /*imprime na tela o indice | o atributo de informacao as informações da lista*/
    public void imprimir (){
        for(int i=0; i<tabela.length;i++){
            System.out.print("indice ="+i+"| ");
            tabela[i].imprimir();
        }
    }


    /*mostra quantas colisão foi feita*/
    public int getColisao(){
        return colisao;
    }
    /* metodo buscar - busca a chave se caso não estiver no atributo, tenta buscar na lista */
    public boolean busca(int chave){
        if(tabela[funcaoHash(chave)].getInformacao() == chave){
            return true;
        }
        else if(tabela[funcaoHash(chave)].getInfoLista(chave)){
                return true;
            }
            return false;
        }






}
