package br.edu.projetoheranca.modelo;

public class Gato extends Animal {
    private String cor;

    public Gato(String nome, int idade, String cor) {
        super(nome, idade);
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String emitirSom() {
        return getNome() + " (gato) diz: Miau!";
    }

    @Override
    public String toString() {
        return "Gato{nome='" + getNome() + "', idade=" + getIdade() + ", cor='" + cor + "'}";
    }
}
