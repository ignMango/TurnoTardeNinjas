package ar.com.imango.monroestreet;

import java.util.List;

public class Lobo implements Subscriptor {

    @Override
    public void notificion(String mensaje) {
        System.out.println(mensaje);
    }
}
