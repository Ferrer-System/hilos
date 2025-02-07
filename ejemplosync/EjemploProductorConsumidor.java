package javaDesdeCeroThread.com.hilos.ejemplosync;

import javaDesdeCeroThread.com.runnable.Consumidor;
import javaDesdeCeroThread.com.runnable.Panadero;

public class EjemploProductorConsumidor {

	public static void main(String[] args) {
		
		Panaderia p = new Panaderia();
		new Thread(new Panadero(p)).start();
		new Thread(new Consumidor(p)).start();

	}

}
