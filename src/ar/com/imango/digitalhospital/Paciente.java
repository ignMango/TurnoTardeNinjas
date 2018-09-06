package ar.com.imango.digitalhospital;

import java.util.ArrayList;
import java.util.List;

public class Paciente {

    private List<Medidor> medidores = new ArrayList<>();

    public void agregarMedidor(Medidor medidor) {
        this.medidores.add(medidor);
    }

    public void eliminarMedidor(Medidor medidor) {
        this.medidores.remove(medidor);
    }


    public void cambiarEstado(Medidor p) {
        for (Medidor m : this.medidores) {
            if (m.equals(p)){
                p.notificarMedico();
            }
        }
    }
}
