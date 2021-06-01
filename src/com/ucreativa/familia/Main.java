package com.ucreativa.familia;

public class Main {

    public static void main(String[] args) {

        Laura alumna = new Laura("Holis", 31, "Leer");
        Jorge papa = new Jorge("Hola Hija", 70, "Jugar Futbal");
        papa.setAge();
        int age = papa.getAge();
        String hobby = papa.getHobby();
        System.out.println("Yo tengo: "+ papa.getAge() + "." + " Y me gusta " + papa.getHobby());
    }
}

//se usa papa xq se usa el objeto no la clase, si fuese estatico se usaría la clase