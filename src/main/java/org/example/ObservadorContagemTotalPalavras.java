package org.example;

import java.util.List;

public class ObservadorContagemTotalPalavras implements iObservador {
    @Override
    public void atualizar(List<String> palavras) {
        int contagem = palavras.size();
        System.out.println("Total de palavras: " + contagem);
    }
}
