package javaDesdeCeroThread.com.hilos;

import java.util.Iterator;

public class ClasThread extends Thread{

	
	
	public ClasThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		System.out.println("Se inicializa el metodo run del hilo " + getName());
		
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(this.getName());
		}
		System.out.println("Finaliza el hilo");
	}
	
	
	

}
