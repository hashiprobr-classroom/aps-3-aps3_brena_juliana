package br.edu.insper.desagil.aps3.vapor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JogoTest {
    private double DELTA = 0.01;
    private Jogo jogo;
    private int identificador;
    private String nome;

    @BeforeEach
    public void setUp(){
        jogo = new Jogo(1, "Super Mario Bros" );
    }

    @Test
    public void constroi(){
        assertEquals(1, jogo.getIdentificador());
        assertEquals("Super Mario Bros", jogo.getNome());
        assertEquals(0, jogo.mediaAvaliacoes());
    }

    @Test
    public void avaliaUmaVez(){
        Usuario usuario = new Usuario("Juliana", "Ju");
        jogo.avaliar("Ju", 3);
        assertTrue(jogo.possuiAvaliacao("Ju"));
        assertFalse(jogo.possuiAvaliacao("Bre"));
        assertEquals(3, jogo.mediaAvaliacoes());
    }

    @Test
    public void avaliaDuasVezes(){
        Usuario usuarioUm = new Usuario("Emily", "Emy");
        Usuario usuarioDois = new Usuario("Hector", "Hectorrrrrrr");

        jogo.avaliar("Emy", 3);
        jogo.avaliar("Hectorrrrrrr", 4);

        assertTrue(jogo.possuiAvaliacao("Emy"));
        assertTrue(jogo.possuiAvaliacao("Hectorrrrrrr"));
        assertEquals(3.5, jogo.mediaAvaliacoes());
    }

    @Test
    public void avaliaTresVezes(){
        Usuario usuarioUm = new Usuario("Davi", "Sokka");
        Usuario usuarioDois = new Usuario("Matheus", "Batman");

        jogo.avaliar("Sokka", 3);
        jogo.avaliar("Batman", 4);
        jogo.avaliar("Sokka", 5);

        assertEquals(4.5, jogo.mediaAvaliacoes());
    }
}

