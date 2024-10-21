public class App {

    public static void main(String[] args) {
        // principal
        Thread hilo1 = new Thread(new Ejecutor("Ejecutor1"));
        Thread hilo2 = new Thread(new Ejecutor("Ejecutor2"));
        Thread hilo3 = new Thread(new Ejecutor("Ejecutor3"));

        hilo1.start();
        hilo2.start();
        hilo3.start();

        try {
            hilo1.join();
            hilo2.join();
            hilo3.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Al terminar contadorPrincipal vale: " +
                Contador.getContadorPrincipal());
    }
}
