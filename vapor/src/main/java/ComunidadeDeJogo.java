import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;


public class ComunidadeDeJogo extends Comunidade {
    private Jogo jogo;

    public ComunidadeDeJogo(Jogo jogo, List<Usuario> membros) {
        super(membros);
        this.jogo = jogo;
    }

    public Jogo getJogo() {
        return jogo;
    }

    @Override
    public void adicionaMembro(Usuario usuario){
        if(jogo.possuiAvaliacao(usuario.getApelido())){
            super.adicionaMembro(usuario);
        }
    }


    public boolean estaAtiva() {
        for (String apelido : listaApelidos()) {
            if (!jogo.possuiAvaliacao(apelido)) {
                return false;
            }
        }
        return true;
    }

}






