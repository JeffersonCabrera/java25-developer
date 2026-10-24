package org.example;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodSample {

    static void main() {
        //Calcular la edad de una persona
        LocalDate nacimiento = LocalDate.of(1974, 11, 06);
        LocalDate hoy = LocalDate.now();

        Period edad = Period.between(nacimiento, hoy);

        System.out.printf(
                "%d años, %d meses, %d días%n",
                edad.getYears(),
                edad.getMonths(),
                edad.getDays()
        );
        System.out.println(ChronoUnit.DAYS.between(nacimiento, hoy)); //diferencia en días
        //fecha de vencimiento a 3 meses

        LocalDate inicio = LocalDate.of(2026, 1, 31);
        LocalDate vencimiento = inicio.plus(Period.ofMonths(3));

        System.out.println(vencimiento);
    }
}
