package br.edu.projetoheranca;

import br.edu.projetoheranca.modelo.Animal;
import br.edu.projetoheranca.modelo.Cachorro;
import br.edu.projetoheranca.modelo.Gato;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Rex", 3, "Labrador");
        Animal gato = new Gato("Mimi", 2, "Branco");

        List<Animal> animais = new ArrayList<>();
        animais.add(cachorro);
        animais.add(gato);

        for (Animal animal : animais) {
            System.out.println(animal.toString());
            System.out.println(animal.emitirSom());
            System.out.println("------");
        }
    }
}
