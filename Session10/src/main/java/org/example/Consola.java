package org.example;

import java.io.Console;
import java.io.PrintWriter;
import java.util.Arrays;

public class Consola {


    public static void main(String[] args) {
        Console c = System.console();
        if (c == null) {
            System.out.println("Console no disponible (entrada o salida redirigida)");
            return;
        }
        System.out.println("isTerminal (Java 22+): " + c.isTerminal());
        PrintWriter out = c.writer();
        String user = c.readLine("Usuario: ");
        char[] password = c.readPassword("Contraseña: ");
        out.println("Hola " + user + ", tu contraseña tiene " + password.length + " caracteres");
        Arrays.fill(password, ' ');
    }
}
