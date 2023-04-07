package org.example;

public class Processador4790 extends Processador{

    public Processador4790(float valorStock) {
        super(valorStock);
    }

    @Override
    public float calcularValorConjunto() {
        return this.valorStock + this.chipset.valorBase();
    }
}
