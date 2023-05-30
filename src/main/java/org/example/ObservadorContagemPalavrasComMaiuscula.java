package org.example;

import java.util.List;

public class ObservadorContagemPalavrasComMaiuscula implements iObservador {
    @Override
    public int atualizar(List<String> palavras) {
        int contagem = 0;
        for (String palavra : palavras) {
            if (Character.isUpperCase(palavra.charAt(0))) {
                contagem++;
            }
        }
        return contagem;
    }
}
