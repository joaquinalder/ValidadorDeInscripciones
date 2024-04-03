package clases;

import java.util.ArrayList;
import java.util.List;

public class Inscripcion {

    private ArrayList<Materia> materias;


    public Inscripcion() {
        materias = new ArrayList<>();
    }
    public boolean CumpleCorrelativas(List<Materia> aprobadas, Materia materia){
        for (Materia mat : materia.getCorrelativas()) {
            if (!aprobadas.contains(mat)) {
                return false;
            }
        }
        return true;
    }
    public boolean aprobada(List<Materia> materiasInscripcion, List<Materia> aprobadas){
        boolean esPosibleInscribir=true;
        int aux=0;

        while(esPosibleInscribir && aux<materiasInscripcion.size()){
            if(!this.CumpleCorrelativas(aprobadas,materiasInscripcion.get(aux))) esPosibleInscribir=false;
            aux++;
        }

        if(esPosibleInscribir) {
            materias.addAll(materiasInscripcion);
            return true;
        }
        else return false;
    }
}