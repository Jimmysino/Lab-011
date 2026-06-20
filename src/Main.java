public class Main {
    public static void main(String[] args) {
        Bebida bebida1=new Expreso();
        bebida1=new Leche(bebida1);
        bebida1=new Soya(bebida1);
        bebida1=new Crema(bebida1);
        bebida1=new Moca(bebida1);
        System.out.println("Bebida 1: ");
        System.out.println(bebida1.getDescripcion());
        System.out.println(bebida1.costo());
        System.out.println("Bebida 2: ");

    }
}
