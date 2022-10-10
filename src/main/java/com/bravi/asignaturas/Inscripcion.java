package com.bravi.asignaturas;

import com.bravi.miembros.Estudiante;

public class Inscripcion {

    private Curso paraEl;
    private Estudiante alumno;

    public Inscripcion(Curso paraEl, Estudiante alumno) {
        this.paraEl = paraEl;
        this.alumno = alumno;
    }

    @Override
    public String toString() {
        return "Inscripcion{" +
                "paraEl=" + paraEl +
                ", alumno=" + alumno +
                '}';
    }

    public Curso getParaEl() {
        return paraEl;
    }

    public Estudiante getAlumno() {
        return alumno;
    }

    public static boolean estaInscripto(String nombreAlumno, Curso curso) {
        return curso.getDelAlumno().values().stream().anyMatch(inscripcion ->
                nombreAlumno.equals(inscripcion.getAlumno().getNombre()));
    }
}
