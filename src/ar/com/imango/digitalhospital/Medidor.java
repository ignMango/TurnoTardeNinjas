package ar.com.imango.digitalhospital;

import java.util.ArrayList;
import java.util.List;

public abstract class Medidor {

    protected List<Subscriptor> subscriptores = new ArrayList<>();

    public void addMedico(Subscriptor subscriptor) {
        this.subscriptores.add(subscriptor);
    }

    public void eliminarMedico(Medico medico) {
        this.subscriptores.remove(subscriptores);
    }

    public abstract void notificarMedico();

}
