public class Expreso extends Bebida{
    public Expreso() {
        descripcion="Expreso";
    }

    @Override
    public double costo() {
        return 1.99;
    }
}
