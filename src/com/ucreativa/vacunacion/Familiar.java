package com.ucreativa.vacunacion;

public class Familiar extends Persona {

    private String parestesco;

    public Familiar(String nombre, String cedula, int edad, boolean riesgo, String parestesco) {
        super(nombre, cedula, edad, riesgo);
        this.parestesco = parestesco;
    }

    public String getParestesco() {
        return parestesco;
    }

}
