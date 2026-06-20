public class Crema extends Complemento{
    Bebida cafe;

    public Crema(Bebida cafe) {
        this.cafe = cafe;
    }

    @Override
    public String getDesciption() {
        return cafe.getDescription()+"Crema";
    }
    public double costo(){
        return cafe.costo()+0.10;
    }
}
