import java.util.HashMap;

public class Descafeinado extends Bebida{
    private HashMap<String, Double> precios = new HashMap<>();
    public Descafeinado() {
        descripcion = "Descafeinado";
        precios.put("N", 1.05);
        precios.put("M", 1.15);
        precios.put("G", 1.25);
    }

    @Override
    public double costo() {
        return precios.getOrDefault(getTamano(), 1.05);
    }
}
