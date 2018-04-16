package br.ufg.integracao;

import java.io.*;

public class Pamonha implements Serializable{
    private String sabor;

    protected Pamonha(String sabor) {
        this.sabor = sabor;
    }

    public String getSabor() {
        return this.sabor;
    }

    public void serializar(String caminho) throws IOException {
        try {
            ObjectOutputStream accData = new ObjectOutputStream(new FileOutputStream(caminho));
            accData.writeObject(this);
            accData.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Pamonha desserealizar(String caminho) throws IOException {
        Pamonha pamonha = null;
        try {
            ObjectInputStream accData = new ObjectInputStream(new FileInputStream(caminho));
            try {
                pamonha = (Pamonha) accData.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            accData.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return pamonha;
    }
}
