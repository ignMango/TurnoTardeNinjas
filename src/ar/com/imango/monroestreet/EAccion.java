package ar.com.imango.monroestreet;

public enum EAccion {

    SUBA {
        @Override
        public String mensaje() {
           return "Subio el valor de la accion";
        }
    },
    BAJA {
        @Override
        public String mensaje() {
            return "Bajo el valor de la accion";
        }
    };

    public abstract String mensaje();
}
