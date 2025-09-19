package br.edu.projetoheranca.modelo;

public class Cachorro extends Animal {
    private String raca;

    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String emitirSom() {
        return getNome() + " (cachorro) diz: Au au!";
    }

    @Override
    public String toString() {
        return "Cachorro{nome='" + getNome() + "', idade=" + getIdade() + ", raca='" + raca + "'}";
    }
}
