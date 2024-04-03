package clases;

import java.util.List;
import java.util.ArrayList;

public class Materia {

    private List<Materia> correlativas;

    public Materia(List<Materia> Correlativas) {
        this.correlativas = Correlativas;
    }

    public Materia() {
        correlativas= new ArrayList<>();
    }

    public void agregarCorrelativa(Materia materia){
        correlativas.add(materia);
    }

    public List<Materia> getCorrelativas() {
        return correlativas;
    }
}