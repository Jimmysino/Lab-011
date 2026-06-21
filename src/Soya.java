import java.util.HashMap;

public class Soya extends  Complemento{
    private HashMap<String, Double> precios = new HashMap<>();

    public Soya(Bebida cafe) {
        this.cafe = cafe;
        precios.put("N", 0.15);
        precios.put("M", 0.20);
        precios.put("G", 0.25);
    }

    @Override
    public String getDescripcion() {
        return cafe.getDescripcion()+", Soya";
    }
    public double costo(){
        return cafe.costo() + precios.getOrDefault(getTamano(), 0.15);
    }
}
