package br.ufg.integracao;

import br.ufg.integracao.Pamonha;

import java.io.*;

public class Serializacao {

    public static void main(String[] args) throws IOException {
        Pamonha pamonha = new Pamonha("doce");

        pamonha.serializar("pamonha.bin");

        Pamonha pamonha2 = pamonha.desserealizar("pamonha.bin");

        System.out.println(pamonha2.getSabor());
    }
}
