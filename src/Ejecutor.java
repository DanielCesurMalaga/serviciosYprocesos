import java.util.concurrent.locks.ReentrantLock;

public class Ejecutor implements Runnable {
    private String nombre;
    private static ReentrantLock cerrojo = new ReentrantLock();

    public Ejecutor(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        // ejecutar un contador Ppal q se incremente 1000 veces de uno en uno.
        // y q muestre por pantalla cada 10 incrementos individuales el valor del
        // contador ppal.
        Contador miContador = new Contador();
        for (int i = 0; i < 1000; i++) {
            cerrojo.lock();
            Contador.incrementarContadorPrincipal();
            
            miContador.incrementarContadorIndividual();

            if (miContador.getContadorIndividual() % 10 == 0) {
                
                System.out.println("El ejecutor: " + this.nombre +
                        " ha incrementado el contador Principal hasta: " +
                        Contador.getContadorPrincipal() +
                        " y su contador Individual es: " +
                        miContador.getContadorIndividual());
                        
            }
            cerrojo.unlock();
        }
    }

}
