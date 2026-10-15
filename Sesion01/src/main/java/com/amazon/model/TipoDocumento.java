package com.amazon.model;

import java.time.LocalDate;

public class TipoDocumento {

    Long idTipoDocumento;
    String numeroDocumento;
    LocalDate fechaInicio;
    LocalDate fechaFin;
    //boolean 2abc;
    //int _ = 0;  NO SE PUEDE

    //constantes
    final static boolean COMPACT_STRINGS = false;

    void playSound() {
        if(1>2) {
            IO.println("1>2 no va ingresar");
        }
        else {
            IO.println("1>2 ingresar");
        }

        return;
    }

    int sumar(int a, int b) {
        return a + b;
    }

    void substract(String s) {
        //IO.println(_);  no se puede
    }
}
