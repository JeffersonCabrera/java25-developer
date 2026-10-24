package org.example;

import java.net.http.HttpClient;
import java.time.Duration;
import java.time.Instant;

public class DurationSample {
    static void main() throws InterruptedException {
        Instant inicio = Instant.now();
        // Simular procesamiento
        Thread.sleep(2500);
        Instant fin = Instant.now();


        Duration duracion = Duration.between(inicio, fin);
        System.out.println("Segundos: " + duracion.toSeconds());
        System.out.println("Milisegundos: " + duracion.toMillis());

        //definiendo un timeout

        Duration timeout = Duration.ofSeconds(5);

        HttpClient cliente = HttpClient.newBuilder()
                .connectTimeout(timeout)
                .build();
        //sumando tiempo
        Instant begin = Instant.now();

        Instant end = begin.plus(Duration.ofMinutes(5));
    }
}
