package org.example;

import java.util.Scanner;

public class Echo {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt;
        System.out.println("Para salir escribe: exit");
        System.out.println("Escribe un valor y pulsa enter:");
        while (!(txt = s.nextLine()).equals("exit")) {
            System.out.println("Echo: " + txt);
        }
    }
}
