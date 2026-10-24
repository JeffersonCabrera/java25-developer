package org.example;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class InstantSample {

    static void main() {
        Instant ahora = Instant.now();

        System.out.println(ahora); //2026-10-24T02:21:22.316657Z

        //23 oct 2026 9:22pm
        // Convertir a la hora de Lima
        ZonedDateTime lima = ahora.atZone(
                ZoneId.of("America/Lima")
        );

        System.out.println(lima);
    }
}
