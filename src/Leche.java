public class Leche extends Complemento{
    Bebida cafe;

    public Leche(Bebida cafe) {
        this.cafe = cafe;
    }

    @Override
    public String getDesciption() {
        return cafe.getDescription()+"Leche";
    }
    public double costo(){
        return 0.10+cafe.costo();
    }
}
