package ar.com.imango.motivador1;

public class Individuo extends Subscriptor{

    private String nombre;
    private Integer dni;
    private String direccion;

    public Individuo(Integer telefonoContacto, String nombre, Integer dni, String direccion) {
        super(telefonoContacto);
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
    }

    @Override
    public void notificacion() {

    }

    public String getNombre() {
        return nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public String getDireccion() {
        return direccion;
    }
}
