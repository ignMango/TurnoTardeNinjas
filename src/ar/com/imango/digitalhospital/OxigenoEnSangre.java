package ar.com.imango.digitalhospital;

public class OxigenoEnSangre extends Medidor {

    @Override
    public void notificarMedico() {
        for (Subscriptor s: this.subscriptores) {
            System.out.println("Se quedo sin oxigeno....");
        }
    }
}
