package pe.joedayz;

import java.lang.*;
import java.util.ArrayList;

import pe.joedayz.animals.Cat;
import pe.joedayz.animals.Hamster;

public class Main {
    static void main() {

        Cat gato = new Cat();
        Hamster aurelio = new Hamster();

        aurelio = null;

        aurelio = new Hamster();
        String nombre = "Jose";
        System.gc();
        ArrayList numeros = new ArrayList();
    }
}

