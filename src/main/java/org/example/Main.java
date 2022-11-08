package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        final File file = new File("expenses.json");
        ObjectMapper mapper = new ObjectMapper();

        try {
            Persona[] personas = mapper.readValue(file, Persona[].class);

            double gasto = 0;
            for (Persona persona : personas) {
                for (Week week : persona.getWEEK()) {
                    for (Expense expense : week.getEXPENSE()) {
                        gasto += expense.getAMOUNT();
                    }
                }
            }

            System.out.println("Gastos totales de todas las personas: " + gasto);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}