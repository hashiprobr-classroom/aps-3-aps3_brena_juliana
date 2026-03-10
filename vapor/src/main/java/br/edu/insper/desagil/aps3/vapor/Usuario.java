package br.edu.insper.desagil.aps3.vapor;


public class Usuario {
    private String apelido;


    private String nome;

    public String getApelido(){
        return apelido;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public  Usuario(String nome, String apelido){
        this.nome = nome;
        this.apelido = apelido;
    }
}
