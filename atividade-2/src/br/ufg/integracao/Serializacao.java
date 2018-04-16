package br.ufg.integracao;

import br.ufg.integracao.Pamonha;

import java.io.*;

public class Serializacao {

    public static void main(String[] args) {
        Pamonha pamonha = new Pamonha("doce");

        try {
            ObjectOutputStream accData = new ObjectOutputStream(new FileOutputStream("pamonha.bin"));
            accData.writeObject(pamonha);
            accData.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
