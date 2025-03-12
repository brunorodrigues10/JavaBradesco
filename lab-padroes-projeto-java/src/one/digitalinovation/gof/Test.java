package one.digitalinovation.gof;

import one.digitalinovation.gof.facade.Facade;
import one.digitalinovation.gof.singleton.SingletonEager;
import one.digitalinovation.gof.singleton.SingletonLazy;
import one.digitalinovation.gof.singleton.SingletonLazyHolder;
import one.digitalinovation.gof.strategy.*;

public class Test {
    public static void main(String[] args) {

        // Singleton
        /**
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        **/

        // Strategy

        /**
        Comportamento Defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento Agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(Defensivo);
        robo.mover();
        robo.setComportamento(Agressivo);
        robo.mover();
        robo.mover();
        robo.mover();
         **/

        // Facade

        Facade facade = new Facade();
        facade.migrarCliente("Venilton", "1233445333");

    }
}
