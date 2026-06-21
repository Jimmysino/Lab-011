import java.util.HashMap;

public class TostadoNegro extends Bebida {
    private HashMap<String, Double> precios = new HashMap<>();

    public TostadoNegro() {

        descripcion="Tostado Negro";
        descripcion = "Tostado Negro";
        precios.put("N", 0.99);
        precios.put("M", 1.09);
        precios.put("G", 1.19);
    }

    @Override
    public double costo() {
       return precios.getOrDefault(getTamano(), 0.99);
    }
}
