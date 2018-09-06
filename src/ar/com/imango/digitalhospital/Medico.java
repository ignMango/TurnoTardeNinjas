package ar.com.imango.digitalhospital;

import java.util.ArrayList;
import java.util.List;

public class Medico implements Subscriptor {

    private List<Medidor> medidores = new ArrayList<>();

    @Override
    public void agregarMedidor(Medidor medidor) {
        this.medidores.add(medidor);
    }

    @Override
    public void eliminarMedidor(Medidor medidor) {
        this.medidores.remove(medidor);
    }

    @Override
    public void notificar(Medidor medidor) {
        medidor.notificarMedico();
    }
}
