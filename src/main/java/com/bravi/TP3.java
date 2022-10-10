package com.bravi;

import com.bravi.asignaturas.Curso;
import com.bravi.asignaturas.Inscripcion;
import com.bravi.exception.ErrorInscripcion;
import com.bravi.miembros.Estudiante;
import com.bravi.miembros.Persona;
import com.bravi.miembros.Profesor;

public class TP3 {

    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Alumno 1", 111);
        Estudiante estudiante2 = new Estudiante("Alumno 2", 222);
        Profesor profesor = new Profesor("Profesor 1");
        Profesor profesor2 = new Profesor("Profesor 2");
        Profesor profesor3 = new Profesor("Profesor 3");
        Profesor profesor4 = new Profesor("Profesor 4");
        Curso curso = new Curso("Matematicas");
        Curso curso2 = new Curso("Lengua");
        Curso curso3 = new Curso("Gimnasia");
        Curso curso4 = new Curso("Informatica");
        profesor.dicta(curso);
        profesor2.dicta(curso2);
        profesor3.dicta(curso3);
        profesor4.dicta(curso4);
        estudiante.inscribir(curso);
        estudiante2.inscribir(curso);
        estudiante.inscribir(curso2);
        estudiante.inscribir(curso3);
        try {
            estudiante.inscribir(curso4);
        } catch (ErrorInscripcion ex) {
            System.out.println(ex.getMessage());
        }
        curso.inscriptos();
        System.out.println("El profesor 1 da: " + profesor.getNombreCurso());
        System.out.println("El profesor 2 da: " + profesor2.getNombreCurso());
        System.out.println("El profesor 3 da: " + profesor3.getNombreCurso());
        System.out.println("El profesor 4 da: " + profesor4.getNombreCurso());
        System.out.println("Cantidad de inscriptos: " + curso.getCantidadInscriptos());
        System.out.println(Inscripcion.estaInscripto("Alumno 1", curso)
                ? "Si esta inscripto"
                : "No esta inscripto");
    }
}
