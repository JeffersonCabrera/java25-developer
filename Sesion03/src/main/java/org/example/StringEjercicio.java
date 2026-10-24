package org.example;

import java.util.Arrays;

public class StringEjercicio {

    public static void main(String[] args) {
        String a = "    Hollywood    ";

        String noLiteral = new String("Hollywood");
        String noLitera2 = "Holly".concat("wood");

        a = a.trim();

        System.out.println("a = " + a);

        String b = a.concat(" is a city in California");
        System.out.println("b = " + b);
        String c  = a + " is a city in California";
        System.out.println("c = " + c);
        String d = c.toLowerCase();
        System.out.println("d = " + d);
        String e = c.toUpperCase();
        System.out.println("e = " + e);
        boolean f = d.contains("W");
        System.out.println("f = " + f);

        IO.println("".isEmpty());

        IO.println("         ".isEmpty());

        IO.println("         ".isBlank());

        IO.println("ja".repeat(5));

        IO.println(String.join("|", "Hola", "Mundo", "Cruel"));
        String[] split = "a,b,c,d,e,f".split(",");
        IO.println(Arrays.toString(split));
        //IO.println(split);
        IO.println("linea1\nlinea2\nlinea3".lines().count());

        IO.println("Hola %s, tienes %d años".formatted("Juan", 30));

        IO.println(String.format("Hola %s, tienes %d años", "Juan", 30));

        String aprima = "HolaMundo";

        //char i = aprima.charAt(10);


    }
}
