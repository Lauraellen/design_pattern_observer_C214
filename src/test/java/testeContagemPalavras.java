import org.example.ObservadorContagemTotalPalavras;
import org.example.Observavel;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class testeContagemPalavras {
    @Test
    public void testContarTodasAsPalavras() {
        Observavel observavel = new Observavel();
        ObservadorContagemTotalPalavras observadorTotal = new ObservadorContagemTotalPalavras();

        observavel.adicionarObservador(observadorTotal);
        String frase = "Primeiro teste";
        assertEquals(observavel.contarPalavras(frase), 2);
    }

}
