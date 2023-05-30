package org.example;

import java.util.List;

public class ObservadorContagemTotalPalavras implements iObservador {
    @Override
    public int atualizar(List<String> palavras) {
        int contagem = palavras.size();
        return contagem;
    }
}
