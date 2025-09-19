package org.example;

public enum Moeda {
    BRL(7.3, "IOF"),
    USD(5.0, "Taxa adicional");
    private final double taxa;
    private final String descricao;

    Moeda(double taxa, String descricao) {
        this.taxa = taxa;
        this.descricao = descricao;
    }

    public double getTaxa() {
        return taxa;
    }

    public String getDescricao() {
        return descricao;
    }
}

