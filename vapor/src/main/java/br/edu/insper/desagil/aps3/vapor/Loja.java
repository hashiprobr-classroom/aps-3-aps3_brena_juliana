package br.edu.insper.desagil.aps3.vapor;

import java.util.List;

public class Loja {
    private Usuario dono;
    private List<Jogo> jogos;

    public Loja(Usuario dono, List<Jogo> jogos){
        this.dono = dono;
        this.jogos = jogos;
    }

    public Usuario getDono(){
        return dono;
    }

    public int numJogosAvaliados(Usuario usuario){
        int i = 0;
        String apelido = usuario.getApelido();

        for (Jogo jogo: this.jogos){
            if (jogo.possuiAvaliacao(apelido)) {
                i++;
            }
        }
        return i;
    }
}
