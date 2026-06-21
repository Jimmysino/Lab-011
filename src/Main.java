import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Double> precioBebidas = new HashMap<>();
        HashMap<String, Double> precioAgregados = new HashMap<>();

        precioBebidas.put("Tostado Negro N", 0.99);
        precioBebidas.put("Tostado Negro M", 1.09);
        precioBebidas.put("Tostado Negro G", 1.19);
        precioBebidas.put("Batido N", 0.89);
        precioBebidas.put("Batido M", 0.99);
        precioBebidas.put("Batido G", 1.09);
        precioBebidas.put("Descafeinado N", 1.05);
        precioBebidas.put("Descafeinado M", 1.15);
        precioBebidas.put("Descafeinado G", 1.25);
        precioBebidas.put("Expreso N", 1.99);
        precioBebidas.put("Expreso M", 2.09);
        precioBebidas.put("Expreso G", 2.15);

        precioAgregados.put("Leche N", 0.10);
        precioAgregados.put("Leche M", 0.15);
        precioAgregados.put("Leche G", 0.20);
        precioAgregados.put("Moca N", 0.20);
        precioAgregados.put("Moca M", 0.25);
        precioAgregados.put("Moca G", 0.30);
        precioAgregados.put("Soya N", 0.15);
        precioAgregados.put("Soya M", 0.20);
        precioAgregados.put("Soya G", 0.25);
        precioAgregados.put("Crema N", 0.10);
        precioAgregados.put("Crema M", 0.15);
        precioAgregados.put("Crema G", 0.20);

        Scanner entradaUsuario = new Scanner(System.in);

        System.out.println("Que tipo de cafe quieres?");
        String eleccionCafe = entradaUsuario.nextLine();

        System.out.println("Que vas a agregar? (Leche, Moca, Soya, Crema o escribe nada)");
        String eleccionExtra = entradaUsuario.nextLine();

        System.out.println("Cual es el tamaño? (N, M, G)");
        String vasoElegido = entradaUsuario.nextLine();

        String armarLlaveCafe = eleccionCafe + " " + vasoElegido;
        String armarLlaveExtra = eleccionExtra + " " + vasoElegido;

        double costoFinal = 0.0;

        if (precioBebidas.containsKey(armarLlaveCafe)) {
            costoFinal = costoFinal + precioBebidas.get(armarLlaveCafe);
        }

        if (precioAgregados.containsKey(armarLlaveExtra)) {
            costoFinal = costoFinal + precioAgregados.get(armarLlaveExtra);
        }

        System.out.println("El precio de tu pedido es: " + costoFinal);

        entradaUsuario.close();
    }
}
