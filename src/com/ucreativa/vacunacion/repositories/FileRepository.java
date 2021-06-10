package com.ucreativa.vacunacion.repositories;

import com.ucreativa.vacunacion.entities.BitacoraVacunas;
import com.ucreativa.vacunacion.entities.Persona;

import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FileRepository implements Repository {

    private List<BitacoraVacunas> FileReader;

    public FileRepository() {
    }


    @Override
    public void save(Persona persona, String marca, Date fecha) {
        this.FileReader.add(new BitacoraVacunas(persona, marca, fecha));

    }

    @Override
    public List<String> get() {
        List<String> lines = new ArrayList<>();
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        for (BitacoraVacunas item : FileReader) {
            lines.add(item.getPersona().getNombre()
                    + " - " + item.getMarca()
                    + " - " + format.format(item.getFecha()));
        }
        return lines;

    }
}