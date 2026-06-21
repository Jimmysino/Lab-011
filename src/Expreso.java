import java.util.HashMap;

public class Expreso extends Bebida{
    private HashMap<String, Double> precios = new HashMap<>();
    public Expreso() {
        descripcion="Expreso";
        precios.put("N", 1.99);
        precios.put("M", 2.09);
        precios.put("G", 2.15);
    }

    @Override
    public double costo() {
        return precios.getOrDefault(getTamano(), 1.99);
    }
}
