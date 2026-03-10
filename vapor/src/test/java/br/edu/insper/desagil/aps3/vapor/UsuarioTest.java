package br.edu.insper.desagil.aps3.vapor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsuarioTest {
    private Usuario usuario;
    private String nome;
    private String apelido;

    @BeforeEach
    public void setUp(){
        usuario = new Usuario("Brena", "Bre");
    }


    @Test
    public void constroi(){
        assertEquals("Brena", usuario.getNome());
        assertEquals("Bre", usuario.getApelido());
    }

    @Test
    public void mudaNome(){
        usuario.setNome("Juliana");
        assertEquals("Juliana", usuario.getNome());
    }
}
