package org.example;
import java.util.ArrayList;
import java.util.List;

public class Observavel implements iObservavel {
    public List<iObservador> observadores;

    public Observavel() {
        observadores = new ArrayList<>();
    }

    @Override
    public void adicionarObservador(iObservador observador) {
        observadores.add(observador);
    }

    @Override
    public void removerObservador(iObservador observador) {
        observadores.remove(observador);
    }

    @Override
    public void contarPalavras(String frase) {
        List<String> palavras = obterPalavras(frase);
        notificarObservadores(palavras);
    }

    @Override
    public List<String> obterPalavras(String frase) {
        List<String> palavras = new ArrayList<>();
        String[] tokens = frase.split("\\s+");

        for (String token : tokens) {
            palavras.add(token.trim());
        }

        return palavras;
    }

    @Override
    public void notificarObservadores(List<String> palavras) {
        for (iObservador observador : observadores) {
            observador.atualizar(palavras);
        }
    }
}
