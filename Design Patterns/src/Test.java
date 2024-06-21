import singleton.SingletonEager;
import singleton.SingletonLayHolder;
import singleton.SingletonLazy;


import stategy.ComportamentoNormal;
import stategy.ComportamentoAgressivo;
import stategy.ComportamentoDefesivo;
import stategy.Comportamento;
import stategy.Robo;

import Facade.facade;
import subsistema1.crm.CrmService;
import subsistema2.cep.CepApi;


public class Test {
    public static void main(String[] args) {
    	
    	//Singleton
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);


        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        
        SingletonLayHolder holder = SingletonLayHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonLayHolder.getInstancia();
        System.out.println(holder);
        
        //Strategy
        
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoDefesivo();
        Comportamento defensivo = new ComportamentoAgressivo();
        
        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        
        //Facade
        facade facade = new facade();
        facade.migrarCliente("Venilton", "04020030");
        		


        
        
           


    }
}
