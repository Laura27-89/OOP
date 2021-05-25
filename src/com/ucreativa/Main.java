package com.ucreativa;

import com.ucreativa.familia.Laura;
import com.ucreativa.familia.Jorge;

public class Main {

    public static void main(String[] args) {

 //       Laura alumna = new Laura();
        Jorge papa = new Jorge("Hola Hija");
        papa.setAge();
        int age = papa.getAge();
        String hobby = papa.getHobby();
        System.out.println("Yo tengo: "+ papa.getAge() + "." + " Y me gusta " + papa.getHobby());
    }
}