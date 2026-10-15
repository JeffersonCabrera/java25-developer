package org.example;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Flujos {


    public static void main(String[] args) throws IOException {
        Path dir = Files.createTempDirectory("flujos");
        Path some = dir.resolve("some.txt");
        Files.writeString(some, "Hola Java IO\nsegunda línea\ntercera línea\n");


        // 1. Datos binarios: el buffer se llena por partes; read devuelve -1 al final
        try (InputStream in = new FileInputStream(some.toFile());
             OutputStream out = new FileOutputStream(dir.resolve("other.bin").toFile())) {
            byte[] buffer = new byte[16];
            int length;
            while ((length = in.read(buffer)) != -1) {
                System.out.println("leídos: " + length + " bytes");
                out.write(buffer, 0, length);
            }
        }

        // 2. Java 9+: transferTo copia todo el flujo sin escribir el bucle
        try (InputStream in = Files.newInputStream(some);
             OutputStream out = Files.newOutputStream(dir.resolve("copy.bin"))) {
            System.out.println("transferTo: " + in.transferTo(out) + " bytes");
        }

        // 3. Datos de caracteres con un charset explícito
        try (Reader in = new FileReader(some.toFile(), StandardCharsets.UTF_8);
             Writer out = new FileWriter(dir.resolve("other.txt").toFile(), StandardCharsets.UTF_8)) {
            char[] buffer = new char[1024];
            int length;
            while ((length = in.read(buffer)) != -1) {
                out.write(buffer, 0, length);
            }
        }

        // 4. Cadena de flujos: bytes -> caracteres -> líneas
        try (BufferedReader in = new BufferedReader(
                new InputStreamReader(new FileInputStream(some.toFile()), StandardCharsets.UTF_8));
             PrintWriter out = new PrintWriter(
                     new OutputStreamWriter(new FileOutputStream(dir.resolve("upper.txt").toFile()), StandardCharsets.UTF_8))) {
            String line;
            while ((line = in.readLine()) != null) {
                out.println(line.toUpperCase());
            }
        }
        System.out.print(Files.readString(dir.resolve("upper.txt")));

    }
}
