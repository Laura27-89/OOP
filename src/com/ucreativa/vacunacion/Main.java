package com.ucreativa.vacunacion;

import com.ucreativa.vacunacion.entities.Amigo;
import com.ucreativa.vacunacion.entities.BitacoraVacunas;
import com.ucreativa.vacunacion.entities.Familiar;
import com.ucreativa.vacunacion.entities.Persona;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Familiar hermano = new Familiar("Andres", "5678", 33,
                true, "Hermano");

        Familiar mama = new Familiar("Marianella", "7654", 59,
                false, "Mama");

        Amigo trabajo = new Amigo("Irene", "8765", 32,
                true, "Amiga de trabajo", "Irene45");


        List<Persona> familia = new ArrayList<>();
        familia.add(mama);
        familia.add(hermano);
        familia.add(trabajo);

        List<BitacoraVacunas> bitacora = new ArrayList<>();
        bitacora.add(new BitacoraVacunas(mama, "Pfizer", new Date()));
        bitacora.add(new BitacoraVacunas(hermano, "Astrazeneca", new Date()));
        bitacora.add(new BitacoraVacunas(trabajo, "Johnson", new Date()));
    }
}
