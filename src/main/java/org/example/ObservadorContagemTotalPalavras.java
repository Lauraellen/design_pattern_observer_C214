package org.example;

import java.util.List;

public class ObservadorContagemTotalPalavras implements iObservador {
    private int contagem = 0;

    @Override
    public void atualizar(List<String> palavras) {
        contagem = palavras.size();
    }

    public int getContagem() {
        return contagem;
    }
}
