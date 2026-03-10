package br.edu.insper.desagil.aps3.vapor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LojaTest {
    private Loja loja;
    private List<Jogo> jogos;
    private Usuario usuario;
    private Jogo jogoUm;
    private Jogo jogoDois;
    private Jogo jogoTres;

    @BeforeEach
    public void setUp(){
        usuario = new Usuario("Juliana", "Ju");
        jogos = new ArrayList<>();

        jogoUm = new Jogo(1, "Super Mario Bros");
        jogoDois = new Jogo(2, "Minecraft");
        jogoTres = new Jogo(3, "The Sims 4");

        jogos.add(jogoUm);
        jogos.add(jogoDois);
        jogos.add(jogoTres);
        loja = new Loja(usuario, jogos);
    }

    @Test
    public void constroi(){
        assertEquals(usuario, loja.getDono());
        assertEquals(0, loja.numJogosAvaliados(usuario));
    }

    @Test
    public void umUsuarioAvaliaUmJogo(){
        jogoDois.avaliar(usuario.getApelido(), 3);
        assertEquals(1,loja.numJogosAvaliados(usuario));
    }

    @Test
    public void umUsuarioAvaliaDoisJogos(){
        jogoDois.avaliar(usuario.getApelido(), 5);
        jogoTres.avaliar(usuario.getApelido(), 3);
        assertEquals(2,loja.numJogosAvaliados(usuario));
    }

    @Test
    public void doisUsuariosAvaliamUmJogo(){
        Usuario usuarioDois = new Usuario("Brena", "Bre");
        jogoUm.avaliar(usuario.getApelido(), 4);
        jogoUm.avaliar(usuarioDois.getApelido(), 4);

        assertEquals(1,loja.numJogosAvaliados(usuario));
        assertEquals(1,loja.numJogosAvaliados(usuarioDois));
    }

    @Test
    public void doisUsuariosAvaliamDoisJogos(){
        Usuario usuarioDois = new Usuario("Marcos", "Flocs");

        jogoUm.avaliar(usuario.getApelido(), 4);
        jogoTres.avaliar(usuarioDois.getApelido(), 4);

        assertEquals(1,loja.numJogosAvaliados(usuario));
        assertEquals(1,loja.numJogosAvaliados(usuarioDois));
    }
}
