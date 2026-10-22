package org.example;

import java.util.ArrayList;
import java.util.List;

public class WrappersEnPasado {

    static void main() {

        //Desde Java 1.4 hacia atras
        ArrayList lista = new ArrayList();
        lista.add(Integer.valueOf(42)); //Boxing

        Integer numero = (Integer) lista.get(0); // Unboxing

        int valor = numero.intValue();

        //Java 5

        ArrayList<Integer> lista2 = new ArrayList<>();
        lista2.add(42); // Boxing automático


        int valor2 = lista2.get(0); // Unboxing automático

        int valor3 = Integer.parseInt("123"); // Conversión de String a int


        IO.println(Short.MAX_VALUE);
        IO.println(Short.MIN_VALUE);

        Integer x = 1000;
        Integer y = 1000;

        IO.println(x == y); // false, porque son objetos diferentes
        IO.println(x.equals(y)); // true, porque los valores son iguales
    }
}
