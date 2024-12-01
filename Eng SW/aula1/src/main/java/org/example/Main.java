package org.example;

public class Main {
    public static void main(String[] args) {
        SalaAula salaAula = new SalaAula();

        Aluno pedro = new Aluno("Pedro", "54321");

        salaAula.cadastrarAluno(pedro);

        System.out.println(salaAula.buscarAluno("Pedro"));
    }
}