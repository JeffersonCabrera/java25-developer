package org.example;

public class EjerciciosCasting {

    public static void main(String[] args) {
        byte a = 127, b = 5;

        byte c = (byte)(a + b);  // -128 a 127

        int d = a + b;  // 132

        int f = a / b;

        System.out.println("f = " + f);  // f = 25

        float g = (float)a/b;  // 25.4

        System.out.println("g = " + g);  // g = 25.4

        //b = b + 1;  error porque falta casting explicito
        b+=1;  // b = 6  , += hace casting implicito
        b++;  // b = 7

        byte z = 127;
        z++;  // z = -128  , overflow

        int maxIntegers = Integer.MAX_VALUE;
        System.out.println("maxIntegers = " + maxIntegers);  // maxIntegers = 2147483647


        //Math.addExact(maxIntegers, 1);  // ArithmeticException: integer overflow

        int rounded1 = Math.round(5.3f);  // 5
        long rounded2 = Math.round(16.5);  // 6


        Math.round(10.5);  // 11
        Math.round(10.4);  // 10

        Math.round(-10.5);  // -10
        Math.round(-10.6);  // -11

        Math.floor(2.7); // 2.0
        Math.floor(2.1); // 2.0
        Math.floor(-2.7); // -3.0
        Math.floor(-2.1); // -3.0


        Math.ceil(2.1); // 3.0
        Math.ceil(2.7); // 3.0
        Math.ceil(-2.1); // -2.0
        Math.ceil(-2.7); // -2.0


        Math.clamp(150, 0, 100);  // 100
        Math.clamp(50, 0, 100);  // 50
        Math.clamp(-50, 0, 100);  // 0

        int aa = 11, bb = 3;
        Math.round(aa/bb);  // 4

        System.out.println(Integer.toBinaryString(9  ));  // 111

        int edad = 20;

        String tipo = (edad >= 18) ? "Mayor de edad" : "Menor de edad";

        int num = 88;
        switch (num) {

            case 1:
                System.out.println("Uno");
                break;
            case 2:
                System.out.println("Dos");
                break;
            case 3:
                System.out.println("Tres");
                break;
            default:
                System.out.println("Número no válido");
                break;
        }


        char estado = 'D';
        double costo = 10;
        double precio = switch (estado){
            case 'S', 'N' -> costo + 1;
            case 'D' -> {
                double descuento = costo * 0.20;
                yield costo - descuento;
            }
            case 'E'->0;
            default -> 3;
        };

        int x = 5;
        int r = switch (x){
            case 1: yield 10;
            case 2: yield 20;
            default: yield 0;
        };


        Object dato = 42;
        String desc = switch (dato){
            case Integer i when i > 10 -> "Es un entero positivo: " + i;
            case Integer i -> "Es un entero: " + i;
            case String s -> "Es una cadena: " + s;
            default -> "Tipo desconocido";
        };

        int nota = 15; // java 25 preview
        String resultado = switch (nota){
            case 0 -> "Desaprobado Con honores";
            case int n when n>=11 -> "Aprobado"; // 11, 12, ... 20
            case int n -> "Desaprobado"; // 1, 2, ... 10
        };


    }
}
