package org.example;

import java.util.List;

public class ObservadorContagemPalavrasComMaiuscula implements iObservador {
    @Override
    public void atualizar(List<String> palavras) {
        int contagem = 0;
        for (String palavra : palavras) {
            if (Character.isUpperCase(palavra.charAt(0))) {
                contagem++;
            }
        }
        System.out.println("Palavras começadas com letra maiúscula: " + contagem);
    }
}
