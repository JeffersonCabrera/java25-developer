package org.example;

public class Alumno {

    //variables de instancia

    int id = 1;  //0
    String name;  //null
    boolean activo; //false


    public void foo(){
        //las variables locales se tienen que inicializar antes de usarlas
        //var te exige que inicialices la variable antes de usarla
        var a = 10;
        boolean status = true;
        System.out.println(a);
        System.out.println(status);
    }
}
