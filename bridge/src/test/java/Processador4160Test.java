import org.example.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Processador4160Test {
    @Test
    public void deveRetornarValorProcessador4160ComChipsetH81(){
        Chipset chipset = new H81();
        Processador4160 processador4160 = new Processador4160(125.0f);
        processador4160.setChipset(chipset);
        assertEquals(185.0f, processador4160.calcularValorConjunto(), 0.01f);
    }

    @Test
    public void deveRetornarValorProcessador4160ComChipsetH85(){
        Chipset chipset = new H85();
        Processador4160 processador4160 = new Processador4160(125.0f);
        processador4160.setChipset(chipset);
        assertEquals(195.0f, processador4160.calcularValorConjunto(), 0.01f);
    }

    @Test
    public void deveRetornarValorProcessador4160ComChipsetH97(){
        Chipset chipset = new H97();
        Processador4160 processador4160 = new Processador4160(125.0f);
        processador4160.setChipset(chipset);
        assertEquals(205.0f, processador4160.calcularValorConjunto(), 0.01f);
    }
}
