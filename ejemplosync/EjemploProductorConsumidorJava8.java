package javaDesdeCeroThread.com.hilos.ejemplosync;

import java.util.concurrent.ThreadLocalRandom;

import javaDesdeCeroThread.com.runnable.Consumidor;
import javaDesdeCeroThread.com.runnable.Panadero;

public class EjemploProductorConsumidorJava8 {

	public static void main(String[] args) {
		
		Panaderia p = new Panaderia();
		new Thread( () -> { 
			for (int i = 0; i < 10; i++) {
				p.hornear("Pan n°: " + i);
				try {
					Thread.sleep(ThreadLocalRandom.current().nextInt(500, 2000));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();
		
		new Thread( () -> {
			for (int i = 0; i < 10; i++) {
				p.consumir();
			}
		}).start();

	}

}
