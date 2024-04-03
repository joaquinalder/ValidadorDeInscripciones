import clases.Estudiante;
import clases.Materia;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Collections;

public class Tests {
    Estudiante estudiante = new Estudiante("Joa");

    Materia matematica2 = new Materia(new ArrayList<>());
    Materia matematica = new Materia(new ArrayList<>());
    Materia algebra = new Materia( new ArrayList<>());
    @Test
    public void inscripcionAprobada() {
        //el estudiante intenta inscribirse en el curso de Matematica que no tiene correlativas
        Assert.assertTrue(estudiante.inscribirse(Collections.singletonList(matematica)));
    }

    @Test
    public void inscripcionDesaprobada() {
        //el estudiante intenta inscribirse en el curso de Matematica2 que tiene como correlativa a Matematica y Algebra
        matematica2.agregarCorrelativa(matematica);
        matematica2.agregarCorrelativa(algebra);

        estudiante.aprobar(matematica);
        //el estudiante no tiene aprobada la correlativa Algebra por lo que no puede inscribirse en Matematica2
        Assert.assertFalse(estudiante.inscribirse(Collections.singletonList(matematica2)));
    }
}