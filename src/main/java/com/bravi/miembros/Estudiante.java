package com.bravi.miembros;

import com.bravi.asignaturas.Curso;
import com.bravi.asignaturas.Inscripcion;
import com.bravi.exception.ErrorInscripcion;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Estudiante extends Persona {

    private Integer legajo;
    private List<Inscripcion> inscripto;

    public Estudiante(String nombre, Integer legajo) {
        super(nombre);
        this.legajo = legajo;
        this.inscripto = new ArrayList<>();
    }

    public void inscribir(Curso curso) {
        if (inscripto != null && inscripto.size() == 3) {
            throw new ErrorInscripcion("El alumno no puede inscribirse en mas de 3 cursos");
        }
        if (curso.getDelAlumno().get(legajo) == null) {
            Inscripcion inscripcion = new Inscripcion(curso, this);
            inscripto.add(inscripcion);
            curso.addInscripcion(this.legajo, inscripcion);
        }
    }

    public Integer getLegajo() {
        return legajo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Estudiante)) return false;
        Estudiante that = (Estudiante) o;
        if (this.getNombre().equals(that.getNombre())) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(legajo);
    }

    @Override
    public String toString() {
        return "Persona: {" +
                "nombre=" + super.getNombre() +
                "}, Estudiante: {" +
                "legajo=" + legajo +
                '}';
    }
}
