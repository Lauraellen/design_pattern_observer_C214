package org.example;

import java.util.List;

public class ObservadorContagemPalavrasComTamanhoPar implements iObservador {
    @Override
    public void atualizar(List<String> palavras) {
        int contagem = 0;
        for (String palavra : palavras) {
            if (palavra.length() % 2 == 0) {
                contagem++;
            }
        }
        System.out.println("Palavras com quantidade par de caracteres: " + contagem);
    }
}
