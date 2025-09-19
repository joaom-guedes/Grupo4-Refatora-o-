package org.example;

public class Produto {
  private String  desc;
  private int qtd;
  private double preco;

    public Produto(String desc, int qtd, double preco) {
        this.desc = desc;
        this.qtd = qtd;
        this.preco = preco;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
