import org.example.ObservadorContagemPalavrasComMaiuscula;
import org.example.ObservadorContagemPalavrasComTamanhoPar;
import org.example.ObservadorContagemTotalPalavras;
import org.example.Observavel;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.EmptyStackException;
public class testeContagemPalavras {
    @Test
    public void testContarTodasAsPalavras() {
        Observavel observavel = new Observavel();
        ObservadorContagemTotalPalavras observadorTotal = new ObservadorContagemTotalPalavras();

        String frase = "Faça sempre o seu melhor";
        observavel.adicionarObservador(observadorTotal);
        observavel.contarPalavras(frase);
        assertEquals(5, observadorTotal.getContagem());
    }

    @Test
    public void testContarPalavrasCaracteresPares() {
        Observavel observavel = new Observavel();
        ObservadorContagemPalavrasComTamanhoPar observadorPar = new ObservadorContagemPalavrasComTamanhoPar();

        String frase = "A mudança é a única constante na vida";
        observavel.adicionarObservador(observadorPar);
        observavel.contarPalavras(frase);
        assertEquals(2, observadorPar.getContagem());
    }

    @Test
    public void testContarPalavrasComMaiuscula() {
        Observavel observavel = new Observavel();
        ObservadorContagemPalavrasComMaiuscula observadorMaiuscula = new ObservadorContagemPalavrasComMaiuscula();

        String frase = "A vida é uma Jornada não um Destino";
        observavel.adicionarObservador(observadorMaiuscula);
        observavel.contarPalavras(frase);
        assertEquals(3, observadorMaiuscula.getContagem());
    }

    @Test(expected = EmptyStackException.class)
    public void testContarPalavrasComMaiusculaStringVazia() {
        Observavel observavel = new Observavel();
        ObservadorContagemPalavrasComMaiuscula observadorMaiuscula = new ObservadorContagemPalavrasComMaiuscula();

        String frase = "";
        observavel.adicionarObservador(observadorMaiuscula);
        observavel.contarPalavras(frase);
    }

}
