package br.ufg.integracao;

import java.io.Serializable;

public class Pamonha implements Serializable{
    private String sabor;

    protected Pamonha(String sabor) {
        this.sabor = sabor;
    }

    public String getSabor() {
        return this.sabor;
    }
}
