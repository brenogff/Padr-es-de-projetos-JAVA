import padroes.de.projetos.java.facade.Facade;
import padroes.de.projetos.java.singleton.SingletonEager;
import padroes.de.projetos.java.singleton.SingletonLazy;
import padroes.de.projetos.java.singleton.SingletonLazyHolder;
import padroes.de.projetos.java.strategy.Comportamento;
import padroes.de.projetos.java.strategy.ComportamentoAgressivo;
import padroes.de.projetos.java.strategy.ComportamentoDefensivo;
import padroes.de.projetos.java.strategy.ComportamentoNormal;
import padroes.de.projetos.java.strategy.Robo;


public class Test {

	public static void main(String[] args) {
		
		// Singleton
		
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
		
		// Strategy
		
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		
		// Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Venilton", "14801788");
	}

}