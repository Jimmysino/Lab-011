public class Leche extends Complemento{
    Bebida cafe;

    public Leche(Bebida cafe) {
        this.cafe = cafe;
    }

    @Override
    public String getDescripcion() {
        return cafe.getDescripcion()+", Leche";
    }
    public double costo(){
        return 0.10+cafe.costo();
    }
}
