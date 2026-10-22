package org.example;

public class TextBlockSample {

    public static void main(String[] args) {
        String basicText = "Tea\tprice 1.99 quantity 2\n\"English Breakfast\"\n";

        System.out.println("basicText = " + basicText);

        String textBlock = """
                Tea price 1.99 quantity 2
                "English Breakfast"
                """;
        System.out.println("textBlock = " + textBlock);


        String textBlockWithIndentation = """
                   This game is a square:       
                X|O|O
                 |O|\s
                X|X|O
                   Text on the\
                   same line
                   These are \""" three quotes\
                """;
        System.out.println("textBlockWithIndentation = " + textBlockWithIndentation);


        String sql =
                "SELECT e.nombre, d.nombre AS departamento " +
                        "FROM empleados e " +
                        "INNER JOIN departamentos d " +
                        "    ON e.departamento_id = d.id " +
                        "WHERE d.nombre = ? " +

                        "UNION " +

                        "SELECT e.nombre, d.nombre AS departamento " +
                        "FROM empleados e " +
                        "INNER JOIN departamentos d " +
                        "    ON e.departamento_id = d.id " +
                        "WHERE d.nombre = ?";

        String sqlTextBlock = """
                SELECT e.nombre, d.nombre AS departamento
                FROM empleados e
                INNER JOIN departamentos d
                    ON e.departamento_id = d.id
                WHERE d.nombre = ?
                
                UNION
                
                SELECT e.nombre, d.nombre AS departamento
                FROM empleados e
                INNER JOIN departamentos d
                    ON e.departamento_id = d.id
                WHERE d.nombre = ?
                """;

    }
}
