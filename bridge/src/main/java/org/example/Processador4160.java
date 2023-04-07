package org.example;

public class Processador4160 extends Processador{

    public Processador4160(float valorStock) {
        super(valorStock);
    }

    @Override
    public float calcularValorConjunto() {
        return this.valorStock + this.chipset.valorBase();
    }
}
