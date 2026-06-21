import java.util.HashMap;

public class Crema extends Complemento{
    private HashMap<String, Double> precios = new HashMap<>();

    public Crema(Bebida cafe) {
        this.cafe = cafe;
        precios.put("N", 0.10);
        precios.put("M", 0.15);
        precios.put("G", 0.20);
    }

    @Override
    public String getDescripcion() {
        return cafe.getDescripcion()+", Crema";
    }
    public double costo(){
        return cafe.costo() + precios.getOrDefault(getTamano(), 0.10);
    }
}
