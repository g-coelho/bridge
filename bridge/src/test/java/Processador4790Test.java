import org.example.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Processador4790Test {

    @Test
    public void deveRetornarValorProcessador4790ComChipsetH81(){
        Chipset chipset = new H81();
        Processador4790 processador4790 = new Processador4790(303.0f);
        processador4790.setChipset(chipset);
        assertEquals(363.0f, processador4790.calcularValorConjunto(), 0.01f);
    }

    @Test
    public void deveRetornarValorProcessador4790ComChipsetH85(){
        Chipset chipset = new H85();
        Processador4790 processador4790 = new Processador4790(303.0f);
        processador4790.setChipset(chipset);
        assertEquals(373.0f, processador4790.calcularValorConjunto(), 0.01f);
    }

    @Test
    public void deveRetornarValorProcessador4790ComChipsetH97(){
        Chipset chipset = new H97();
        Processador4790 processador4790 = new Processador4790(303.0f);
        processador4790.setChipset(chipset);
        assertEquals(383.0f, processador4790.calcularValorConjunto(), 0.01f);
    }


}

