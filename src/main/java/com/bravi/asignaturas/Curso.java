package com.bravi.asignaturas;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Curso {

    private String titulo;
    private Map<Integer, Inscripcion> delAlumno;

    public Curso(String titulo) {
        this.titulo = titulo;
        this.delAlumno = new Hashtable<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Map<Integer, Inscripcion> getDelAlumno() {
        return delAlumno;
    }

    public void inscriptos() {
        if (delAlumno != null) {
            delAlumno.forEach((key, value) -> System.out.println(String.format("Legajo: %s, Inscripcion: %s", key, value)));
        }
    }

    public Integer getCantidadInscriptos() {
        if (this.delAlumno != null) {
            return this.delAlumno.size();
        }
        return 0;
    }

    public void addInscripcion(Integer legajo, Inscripcion inscripcion) {
        this.delAlumno.put(legajo, inscripcion);
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                '}';
    }
}
