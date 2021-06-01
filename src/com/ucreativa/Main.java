package com.ucreativa;

import com.ucreativa.familia.Laura;
import com.ucreativa.familia.Jorge;
import com.ucreativa.vacunacion.Amigo;
import com.ucreativa.vacunacion.Familiar;
import com.ucreativa.vacunacion.Persona;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Laura alumna = new Laura("Holis", 31, "Leer");
        Jorge papa = new Jorge("Hola Hija", 70, "Jugar Futbal");
        papa.setAge();
        int age = papa.getAge();
        String hobby = papa.getHobby();
        System.out.println("Yo tengo: "+ papa.getAge() + "." + " Y me gusta " + papa.getHobby());

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

    }
}

//se usa papa xq se usa el objeto no la clase, si fuese estatico se usaría la clase