import org.junit.Test;

public class testeContagemPalavras {
    @Test
    public void testContarTodasAsPalavras() {
        ContadorPalavras contadorPalavras = new ContadorPalavras();
        ObservadorContagemTotalPalavras observadorTotal = new ObservadorContagemTotalPalavras();

        contadorPalavras.adicionarObservador(observadorTotal);
        String frase = "Primeiro teste";
        assertEquals(contadorPalavras.contarPalavras(frase), 2);
    }

}
