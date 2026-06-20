public class Soya extends  Complemento{
    Bebida cafe;

    public Soya(Bebida cafe) {
        this.cafe = cafe;
    }

    @Override
    public String getDescripcion() {
        return cafe.getDescripcion()+", Soya";
    }
    public double costo(){
        return cafe.costo()+0.15;
    }
}
