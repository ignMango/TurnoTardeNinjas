package ar.com.imango.digitalhospital;

public class ActividadCerebral extends Medidor {

    @Override
    public void notificarMedico() {
        for (Subscriptor s: this.subscriptores) {
            System.out.println("le agarra la vaca loca....");
        }
    }
}
