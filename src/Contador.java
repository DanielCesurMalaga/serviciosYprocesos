import java.util.concurrent.locks.ReentrantLock;
public class Contador {
    private static int contadorPrincipal = 0;
    private int contadorIndividual;
    //private static ReentrantLock cerrojo = new ReentrantLock();

    public Contador() {
        this.contadorIndividual=0;
    }

    public static int getContadorPrincipal() {
        //cerrojo.lock();
        int contadorTemp= contadorPrincipal;
        //cerrojo.unlock();
        return contadorTemp;
    }

    public static void incrementarContadorPrincipal() {
        //cerrojo.lock();
        contadorPrincipal++;
        //cerrojo.unlock();
    }

    public int getContadorIndividual() {
        return contadorIndividual;
    }

    public void incrementarContadorIndividual() {
        this.contadorIndividual++;
    }

}
