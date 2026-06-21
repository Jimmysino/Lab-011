import java.util.HashMap;

public class Moca extends Complemento{
    private HashMap<String, Double> precios = new HashMap<>();

    public Moca(Bebida cafe) {
        this.cafe = cafe;
        precios.put("N", 0.20);
        precios.put("M", 0.25);
        precios.put("G", 0.30);
    }

    @Override
    public String getDescripcion() {
        return cafe.getDescripcion()+", Moca";
    }
    public double costo(){
        return cafe.costo() + precios.getOrDefault(getTamano(), 0.20);
    }
}
