package br.edu.insper.desagil.aps3.vapor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComunidadeTest {
    private Comunidade comunidade;
    private List<Usuario> membros;

    @BeforeEach
    public void setUp(){
        membros = new ArrayList<>();
        comunidade = new Comunidade(membros);
    }

    @Test
    public void constroi(){
        membros = List.of();
        assertEquals(List.of(), membros);
    }

    @Test
    public void adicionaUmMembro(){
        Usuario usuario = new Usuario("Juliana", "Ju");
        comunidade.adicionaMembro(usuario);
        assertEquals(List.of("Ju"), comunidade.listaApelidos());

    }

    @Test
    public void adicionaDoisMembros(){
        Usuario usuarioUm = new Usuario("Juliana", "Ju");
        Usuario usuarioDois = new Usuario("Brena", "Bre");
        comunidade.adicionaMembro(usuarioUm);
        comunidade.adicionaMembro(usuarioDois);
        assertEquals(List.of("Ju", "Bre"), comunidade.listaApelidos());
    }
}
