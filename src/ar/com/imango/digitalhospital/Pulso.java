package ar.com.imango.digitalhospital;

public class Pulso extends Medidor {

    @Override
    public void notificarMedico() {
        for (Subscriptor s: this.subscriptores) {
            System.out.println("Sube la actividad Cardiaca");
        }
    }
}
