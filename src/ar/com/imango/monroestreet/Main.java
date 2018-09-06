package ar.com.imango.monroestreet;

public class Main {

    public static void main(String[] args) {
        Accion a = new Accion();
        Accion a2= new Accion();

        Lobo lobo1 = new Lobo();
        Lobo lobo2 = new Lobo();
        Lobo lobo3 = new Lobo();

        a.agregarSubscriptor(lobo1);
        a.agregarSubscriptor(lobo2);

        a2.agregarSubscriptor(lobo3);

        a.notificar(EAccion.SUBA);
        a2.notificar(EAccion.BAJA);






    }
}
