public class main {
    public static void main(String[] args) {
        D d = new D();
        System.out.println("Valores iniciales:");
        d.mostrar();

        d.incrementaXYZ();
        System.out.println("Después de incrementar:");
        d.mostrar();
    }
}