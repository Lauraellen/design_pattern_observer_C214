package org.example;

import java.util.List;

public class ObservadorContagemPalavrasComMaiuscula implements iObservador {
    private int contagem = 0;
    
    @Override
    public void atualizar(List<String> palavras) {
        for (String palavra : palavras) {
            if (Character.isUpperCase(palavra.charAt(0))) {
                contagem++;
            }
        }
    }
    
    public int getContagem() {
        return contagem;
    }
}
