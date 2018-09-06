package ar.com.imango.motivador1;

public interface Notificador {

    void agregar(IDiario diario);
    void eliminar(IDiario diario);
    void notificarSubscriptores();
}
