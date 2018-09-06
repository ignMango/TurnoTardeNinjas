package ar.com.imango.digitalhospital;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {



    public static void main(String[] args) {

        Medidor pulso = new Pulso();
        Medidor oxigeno = new OxigenoEnSangre();
        Medidor actividadCerebral = new ActividadCerebral();

        List<Medidor> medidores = new ArrayList<>();
        medidores.addAll(Arrays.asList(pulso,oxigeno, actividadCerebral));

        Medico m1 = new Medico();
        Medico m2 = new Medico();
        Medico m3 = new Medico();

        m1.agregarMedidor(pulso);
        m1.agregarMedidor(oxigeno);

        pulso.addMedico(m1);
        pulso.addMedico(m2);

        Paciente p = new Paciente();
        p.agregarMedidor(pulso);
        p.agregarMedidor(oxigeno);

        p.cambiarEstado(pulso);

        System.out.println("Holaaaaaaaa");


    }
}
