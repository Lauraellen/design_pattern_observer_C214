package org.example;

import java.util.List;

public class ObservadorContagemPalavrasComTamanhoPar implements iObservador {
    @Override
    public int atualizar(List<String> palavras) {
        int contagem = 0;
        for (String palavra : palavras) {
            if (palavra.length() % 2 == 0) {
                contagem++;
            }
        }
        return contagem;
    }
}
