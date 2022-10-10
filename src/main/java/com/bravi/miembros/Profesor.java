package com.bravi.miembros;

import com.bravi.asignaturas.Curso;

import java.util.Hashtable;

public class Profesor extends Persona {

    private Curso docente;

    public Profesor(String nombre) {
        super(nombre);
    }

    public void dicta(Curso curso) {
        this.docente = curso;
    }

    public String getNombreCurso() {
        return this.docente.getTitulo();
    }


}
