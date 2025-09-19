package org.example;

import java.util.ArrayList;

public class Usuario {
    private String ID;
    private String nome;
    private ArrayList<Produto> produtos = new ArrayList<>();

    public Usuario(ArrayList<Produto> produtos, String nome, String ID) {
        this.produtos = produtos;
        this.nome = nome;
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }
}
