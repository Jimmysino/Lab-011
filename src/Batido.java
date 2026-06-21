import java.util.HashMap;

public class Batido extends  Bebida{
    private HashMap<String, Double> precios = new HashMap<>();
    public Batido() {
        descripcion="Batido";
        descripcion = "Batido";
        precios.put("N", 0.89);
        precios.put("M", 0.99);
        precios.put("G", 1.09);
    }

    @Override
    public double costo() {
        return precios.getOrDefault(getTamano(), 0.89);

    }
}
