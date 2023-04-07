import org.example.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Processador4440Test {
    @Test
    public void deveRetornarValorProcessador4440ComChipsetH81(){
        Chipset chipset = new H81();
        Processador4440 processador4440 = new Processador4440(182.0f);
        processador4440.setChipset(chipset);
        assertEquals(242.0f, processador4440.calcularValorConjunto(), 0.01f);
    }

    @Test
    public void deveRetornarValorProcessador4440ComChipsetH85(){
        Chipset chipset = new H85();
        Processador4440 processador4440 = new Processador4440(182.0f);
        processador4440.setChipset(chipset);
        assertEquals(252.0f, processador4440.calcularValorConjunto(), 0.01f);
    }

    @Test
    public void deveRetornarValorProcessador4440ComChipsetH97(){
        Chipset chipset = new H97();
        Processador4440 processador4440 = new Processador4440(182.0f);
        processador4440.setChipset(chipset);
        assertEquals(262.0f, processador4440.calcularValorConjunto(), 0.01f);
    }    
}
