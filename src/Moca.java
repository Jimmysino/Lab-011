public class Moca extends Complemento{
    Bebida cafe;

    public Moca(Bebida cafe) {
        this.cafe = cafe;
    }

    @Override
    public String getDescripcion() {
        return cafe.getDescripcion()+", Moca";
    }
    public double costo(){
        return cafe.costo()+0.20;
    }
}
