package ar.com.imango.motivador1;

public abstract class Subscriptor implements IDiario{

    private Integer telefonoContacto;

    public Subscriptor(Integer telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    public Integer getTelefonoContacto() {
        return telefonoContacto;
    }

}