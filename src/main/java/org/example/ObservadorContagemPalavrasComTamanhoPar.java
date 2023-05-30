package org.example;

import java.util.List;

public class ObservadorContagemPalavrasComTamanhoPar implements iObservador {
    private int contagem = 0;

    @Override
    public void atualizar(List<String> palavras) {
        contagem = 0;
        for (String palavra : palavras) {
            if (palavra.length() % 2 == 0) {
                contagem++;
            }
        }
    }

    public int getContagem() {
        return contagem;
    }
}
