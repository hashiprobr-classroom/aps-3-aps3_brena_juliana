package br.edu.insper.desagil.aps3.vapor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComunidadeDeJogoTest {
    private ComunidadeDeJogo comunidade;
    private Jogo jogo;
    private List<Usuario> membros;

    @BeforeEach
    public void setUp(){
        jogo = new Jogo(1, "The Sims 4");
        membros = new ArrayList<>();
        comunidade = new ComunidadeDeJogo(jogo, membros);
    }

    @Test
    public void adicionaDoisInvalidos(){
        Usuario usuarioUm = new Usuario("Juliana", "Ju");
        Usuario usuarioDois = new Usuario("Brena", "Bre");

        comunidade.adicionaMembro(usuarioUm);
        comunidade.adicionaMembro(usuarioDois);

        assertEquals(List.of(),comunidade.listaApelidos());
    }

    @Test
    public void adicionaUmInvalidoUmValido(){
        Usuario usuarioUm = new Usuario("Davi", "Sokka");
        Usuario usuarioDois = new Usuario("Emily", "Emy");

        jogo.avaliar(usuarioUm.getApelido(), 4);
        comunidade.adicionaMembro(usuarioUm);
        comunidade.adicionaMembro(usuarioDois);

        assertEquals(List.of("Sokka"),comunidade.listaApelidos());
    }

    @Test
    public void adicionaDoisValidos(){
        Usuario usuarioUm = new Usuario("Hector", "Hectorrrrrrr");
        Usuario usuarioDois = new Usuario("Matheus", "Mathews");

        jogo.avaliar(usuarioUm.getApelido(), 4);
        jogo.avaliar(usuarioDois.getApelido(), 3);
        comunidade.adicionaMembro(usuarioUm);
        comunidade.adicionaMembro(usuarioDois);

        assertEquals(List.of("Hectorrrrrrr", "Mathews"),comunidade.listaApelidos());
    }
}
