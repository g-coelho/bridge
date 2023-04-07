package org.example;

public abstract class Processador {
    protected Chipset chipset;
    protected float valorStock;

    public Processador(float valorStock){
        this.valorStock = valorStock;
    }

    public void setChipset(Chipset chipset) {
        this.chipset = chipset;
    }

    public void setValorStock(float valorStock) {
        this.valorStock = valorStock;
    }

    public abstract float calcularValorConjunto();
}
