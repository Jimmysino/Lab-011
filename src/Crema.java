public class Crema extends Complemento{
    Bebida cafe;

    public Crema(Bebida cafe) {
        this.cafe = cafe;
    }

    @Override
    public String getDescripcion() {
        return cafe.getDescripcion()+", Crema";
    }
    public double costo(){
        return cafe.costo()+0.10;
    }
}
