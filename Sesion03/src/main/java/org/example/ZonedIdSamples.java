package org.example;

import java.time.ZoneId;
import java.util.Set;
import java.util.TreeSet;

public class ZonedIdSamples {
    static void main() {
        Set<String> zonas = new TreeSet<>(
                ZoneId.getAvailableZoneIds()
        );

        zonas.forEach(System.out::println);

        System.out.println("Total: " + zonas.size());
    }
}
