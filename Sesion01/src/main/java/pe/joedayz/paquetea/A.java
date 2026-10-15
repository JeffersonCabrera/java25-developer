package pe.joedayz.paquetea;

public class A {

    public String m1;
    private String m4;

    protected String m2;
    String m3; // default access modifier (package-private)

    void play(){
        System.out.println("play " + m3);
    }

    protected void run(){
        System.out.println("run");
    }
}
