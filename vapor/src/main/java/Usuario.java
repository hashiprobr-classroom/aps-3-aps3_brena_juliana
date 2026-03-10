import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;


public class Usuario {
    private String apelido;
    private String nome;

    public String getApelido(){return apelido;}

    public String getNome(){return nome;}


    public  Usuario(String nome, String apelido){
        this.nome = nome;
        this.apelido = apelido;
    }
}
