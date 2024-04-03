package clases;

import java.util.ArrayList;
import java.util.List;

public class Estudiante{
    private String name;
    private List<Materia> materiasAprobadas;

    public Estudiante(String name){
        this.name = name;
        materiasAprobadas = new ArrayList<>();
    }

    public void aprobar(Materia mat){
        materiasAprobadas.add(mat);
    }

    public boolean inscribirse(List<Materia> materiasInscripcion){
        Inscripcion inscripcion= new Inscripcion();
        boolean aprobada=inscripcion.aprobada(materiasInscripcion,materiasAprobadas);
        return aprobada;
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

}