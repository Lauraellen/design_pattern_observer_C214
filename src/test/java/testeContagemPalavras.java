import org.example.ObservadorContagemTotalPalavras;
import org.example.Observavel;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class testeContagemPalavras {
    @Test
    public void testContarTodasAsPalavras() {
        Observavel observavel = new Observavel();
        ObservadorContagemTotalPalavras observadorTotal = new ObservadorContagemTotalPalavras();

        String frase = "Primeiro teste";
        observavel.adicionarObservador(observadorTotal);
        observavel.contarPalavras(frase);
        assertEquals(2, observadorTotal.getContagem());
    }

}
