package javaDesdeCeroThread.com.hilos;

import javaDesdeCeroThread.com.runnable.ImprimirFraces;

public class EjemploSincronizacionThread {

	public static void main(String[] args) throws InterruptedException {

		new Thread(new ImprimirFraces("Hola", "Que tal")).start();
		new Thread(new ImprimirFraces("¿Quien eres ", "tu?")).start();
		Thread.sleep(100);
		Thread h3 = new Thread(new ImprimirFraces("Muchas ", "gracias amigo!"));
		h3.start();
		Thread.sleep(100);
		System.out.println(h3.getState());
	}
	
	public synchronized static void imprimirFrases(String frace1, String frace2) {
		System.out.println(frace1);
		
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		System.out.println(frace2);
	}

}
