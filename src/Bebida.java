public abstract class Bebida {
    String descripcion="Bebida desconocida";
    String tamano = "N";

    public abstract double costo();

    public String getDescripcion() {
        return descripcion;
    }
    public String getTamano() {
        return tamano;
    }
    public void setTamano(String tamano) {
        this.tamano = tamano.toUpperCase();
    }
}
