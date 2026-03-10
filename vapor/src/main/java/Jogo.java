import java.util.HashMap;
import java.util.Map;

public class Jogo {
    private int identificador;
    private String nome;
    private Map<String,Integer> dicjogo;

    public Jogo(int identificador,String nome){
        this.identificador = identificador;
        this.nome = nome;
        this.dicjogo = new HashMap<>();
    }

    public int getIdentificador(){
        return identificador;
    }

    public String getNome(){
        return nome;
    }

    public void avaliar (String apelido, int avaliacao){
        this.dicjogo.put(apelido,avaliacao);
    }

    public boolean possuiAvaliacao (String apelido){
        return this.dicjogo.containsKey(apelido);
    }

    public double mediaAvaliacoes(){
        if (this.dicjogo.isEmpty()){
            return 0.0;
        }

        double soma = 0;
        for (int avaliacao : this.dicjogo.values()){
            soma += avaliacao;
        }
        return soma/this.dicjogo.size();
    }
}
