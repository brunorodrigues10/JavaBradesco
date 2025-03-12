package one.digitalinovation.gof;

/**
 * Singleton "Apressado"
 *
 * @author Eu
 */

public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }

}
