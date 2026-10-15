package pe.joedayz.paquetez;

import pe.joedayz.paquetea.A;


//Z hijo o nieto de la familia de A
public class Z extends A {

    public void doThings(){


        // COMO PROPIEDAD O ATRIBUTO HEREADO SI PUEDO ACCEDER A ELLA DIRECTAMENTE
        System.out.println("m2: " + m2); // This is valid because m2 is protected and Z is a subclass of A

        run();

        //ALERTA en el examen

//        A a = new A();
//        a.m1 = "m1";
//        a.m2 = "m2"; // This line will cause a compilation error because
//

    }
}
