

package pe.joedayz;


import module java.base;
import module java.desktop;
import pe.joedayz.animals.Dog;
import java.util.List;


public class Person {

    List<Integer> numeros = new ArrayList<>();


    void play(){
        Dog dog = new Dog();
        dog.name = "Rex";

        Ball ball = new Ball();
        dog.fetch(ball);

        Carro carro = new Carro();

        pe.joedayz.comments.Example example =
                new pe.joedayz.comments.Example();
    }

}


