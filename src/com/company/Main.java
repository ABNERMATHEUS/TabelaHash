package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);
        int entrada;
        TabelaHash tabelaHash = new TabelaHash(100);
        tabelaHash.insere(10);
        tabelaHash.insere(10);

        tabelaHash.imprimir();

        /*===========================*/
        do{
            System.out.print("Digite: ");
            entrada = scanner.nextInt();
            if(entrada != -1){
                System.out.println(tabelaHash.busca(entrada));
            }

        }while (entrada != -1);
        /*===========================*/

    }

}
