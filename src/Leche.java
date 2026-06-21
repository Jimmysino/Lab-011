import java.util.HashMap;

public class Leche extends Complemento{
    private HashMap<String, Double> precios = new HashMap<>();

    public Leche(Bebida cafe) {
        this.cafe = cafe;
        precios.put("N", 0.10);
        precios.put("M", 0.15);
        precios.put("G", 0.20);
    }

    @Override
    public String getDescripcion() {
        return cafe.getDescripcion()+", Leche";
    }
    public double costo(){
        return cafe.costo() + precios.getOrDefault(getTamano(), 0.10);
    }
}
