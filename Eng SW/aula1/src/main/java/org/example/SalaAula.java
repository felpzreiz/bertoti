package org.example;

import java.util.LinkedList;
import java.util.List;

public class SalaAula {
    private List<Aluno> alunos = new LinkedList<Aluno>();

    public void cadastrarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public List<Aluno> buscarAluno(String nome){
        List<Aluno> alunosEncontrados = new LinkedList<Aluno>();

        for(Aluno aluno : alunos){
            if(aluno.getNome().equals(nome)) alunosEncontrados.add(aluno);
        }

        return alunosEncontrados;
    }

    public List<Aluno> getAlunos(){
        return alunos;
    }
}