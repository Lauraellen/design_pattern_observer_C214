package org.example;

import java.util.List;

public interface iObservavel {
    public void adicionarObservador(iObservador observador);
    public void removerObservador(iObservador observador);
    public void contarPalavras(String frase);
    public List<String> obterPalavras(String frase);
    public void notificarObservadores(List<String> palavras);
}
