public class Moca extends Complemento{
    Bebida cafe;

    public Moca(Bebida cafe) {
        this.cafe = cafe;
    }

    @Override
    public String getDesciption() {
        return cafe.getDescription()+"Moca";
    }
    public double costo(){
        return cafe.costo()+0.20;
    }
}
