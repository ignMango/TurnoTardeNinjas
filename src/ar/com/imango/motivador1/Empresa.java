package ar.com.imango.motivador1;

public class Empresa extends Subscriptor {

    private Integer cuit;
    private Integer cantidadEmpleados;

    public Empresa(Integer telefonoContacto, Integer cuit, Integer cantidadEmpleados) {
        super(telefonoContacto);
        this.cuit = cuit;
        this.cantidadEmpleados = cantidadEmpleados;
    }

    @Override
    public void notificacion() {
        System.out.println("Te llego el diario empresa");
    }

    public Integer getCuit() {
        return cuit;
    }

    public Integer getCantidadEmpleados() {
        return cantidadEmpleados;
    }
}
