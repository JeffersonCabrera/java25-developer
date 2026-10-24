package org.example;

public class StringPoolSample {


    public static void main(String[] args) {
        String a = "Hola";

        String b = a;

        String c = "Hola";

        IO.println(a == b);
        IO.println(a == c);

        char[] letras = {'H', 'o', 'l', 'a'};
        String d = new String(letras);
        String e = new String("Hola");
        IO.println(a == d);
        IO.println(a == e);

        String f = d.intern(); // intern returns a reference to the string from the pool
        IO.println(a == f);

        if(a.equals(e)){
            IO.println("a and e are equal");
        }else{
            IO.println("a and e are not equal");
        }


        String x  = "        Hola      ";
        x = x.strip();
        IO.println("x = " + x);
    }
}
