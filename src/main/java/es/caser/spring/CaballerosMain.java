package es.caser.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import es.caser.spring.caballeros.Caballero;

public class CaballerosMain {

	public static void main(String[] args) throws Exception {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/caballeros.xml");
		Caballero caballero = context.getBean(Caballero.class);
		caballero.iniciarMision();
		context.close();
	}

}
