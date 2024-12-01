package org.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.List;

public class Teste {

    @Test
    public void test() {
        SalaAula fatec = new SalaAula();

        Aluno joao = new Aluno("João", "12345");

        fatec.cadastrarAluno(joao);

        assertEquals(fatec.getAlunos().size(), 1);

        List<Aluno> joaos = fatec.buscarAluno("João");

        assertEquals(joaos.get(0).getNome(), joao.getRa());

    }
}
