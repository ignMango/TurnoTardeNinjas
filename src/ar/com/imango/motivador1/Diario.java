package ar.com.imango.motivador1;

import java.util.List;

public class Diario implements Notificador {

    private List<IDiario> subscriptores;

    public Diario(List<IDiario> subscriptores) {
        this.subscriptores = subscriptores;
    }

    @Override
    public void agregar(IDiario diario) {
        this.subscriptores.add(diario);
    }

    @Override
    public void eliminar(IDiario diario) {
        this.subscriptores.add(diario);
    }

    @Override
    public void notificarSubscriptores() {
        for (IDiario diario: this.subscriptores ) {
            diario.notificacion();
        }

    }
}
