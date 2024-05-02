package AV1;

public class Jogadores {

    private String nome;
    private Integer votos;

    public Jogadores(String nome, Integer votos) {
        this.nome = nome;
        this.votos = votos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getVotos() {
        return votos;
    }

    public void setVotos(Integer votos) {
        this.votos = votos;
    }

    public void incrementaUmVoto() {
        this.votos = getVotos() + 1;
    }


}