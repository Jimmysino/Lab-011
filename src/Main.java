import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entradaUsuario = new Scanner(System.in);

        System.out.println("Que tipo de cafe quieres? (Tostado, Batido, Descafeinado, Expreso)");
        String eleccionCafe = entradaUsuario.nextLine().toLowerCase();

        System.out.println("Cual es el tamaño? (N, M, G)");
        String vasoElegido = entradaUsuario.nextLine().toUpperCase();


        Bebida miBebida = null;
        switch (eleccionCafe) {
            case "tostado": miBebida = new TostadoNegro(); break;
            case "batido": miBebida = new Batido(); break;
            case "descafeinado": miBebida = new Descafeinado(); break;
            case "expreso": miBebida = new Expreso(); break;
            default:
                System.out.println("Bebida no válida.");
                return;
        }

        // 2. Asignar el tamaño
        miBebida.setTamano(vasoElegido);

        System.out.println("Que vas a agregar? (Leche, Moca, Soya, Crema o escribe nada)");
        String eleccionExtra = entradaUsuario.nextLine().toLowerCase();

        switch (eleccionExtra) {
            case "leche": miBebida = new Leche(miBebida); break;
            case "moca": miBebida = new Moca(miBebida); break;
            case "soya": miBebida = new Soya(miBebida); break;
            case "crema": miBebida = new Crema(miBebida); break;
            case "nada": break;
            default: System.out.println("Complemento no válido, se omitirá.");
        }

        System.out.println("Resumen: " + miBebida.getDescripcion() + " (Tamaño " + miBebida.getTamano() + ")");
        System.out.println("El precio de tu pedido es: $" + String.format("%.2f", miBebida.costo()));

        entradaUsuario.close();
    }
}
