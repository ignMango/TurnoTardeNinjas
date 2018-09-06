package ar.com.imango.digitalhospital;

public interface Subscriptor {

    void eliminarMedidor(Medidor medidor);
    void agregarMedidor(Medidor medidor);
    void notificar(Medidor medidor);
}
