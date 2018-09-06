package ar.com.imango.monroestreet;

import java.util.ArrayList;
import java.util.List;

public class Accion {

    private List<Subscriptor> subscriptores = new ArrayList<>();

    public void agregarSubscriptor(Subscriptor s) {
        this.subscriptores.add(s);
    }

    public void eliminarSubscriptor(Subscriptor s) {
        this.subscriptores.remove(s);
    }

    public void notificar(EAccion m) {
        for (Subscriptor s : this.subscriptores) {
            s.notificion(m.mensaje());
        }
    }


}
