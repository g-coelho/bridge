package org.example;

public class Processador4440 extends Processador{
    public Processador4440(float valorStock) {
        super(valorStock);
    }

    @Override
    public float calcularValorConjunto() {
        return this.valorStock + this.chipset.valorBase();
    }
}
