package br.com.serverside.model;

public class Procedimento {
    private long id;
    private int procedimento;
    private int idade;
    private String sexo;

    public Procedimento(long id, int procedimento, int idade, String sexo) {
        this.id = id;
        this.procedimento = procedimento;
        this.idade = idade;
        this.sexo = sexo;
    }

    public Procedimento(int procedimento, int idade, String sexo) {
        this(0, procedimento, idade, sexo);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getProcedimento() {
        return procedimento;
    }

    public void setProcedimento(int procedimento) {
        this.procedimento = procedimento;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

}
