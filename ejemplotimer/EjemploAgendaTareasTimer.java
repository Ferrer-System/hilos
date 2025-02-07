package javaDesdeCeroThread.com.hilos.ejemplotimer;

import java.awt.Toolkit;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

public class EjemploAgendaTareasTimer {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		AtomicInteger contadorAtomicInteger = new AtomicInteger(3);

		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			//private int contador = 3;
			int i = contadorAtomicInteger.getAndDecrement();
			@Override
			public void run() {
				if (i > 0) {
					toolkit.beep();
					System.out.println("Tarea " + i + " periodica en: " + new Date() + " nombre del Thread: "
						+ Thread.currentThread().getName());
					
					i --;
				}else {
					System.out.println("Finaliza el tiempo");
					timer.cancel();
				}
				// TODO Auto-generated method stub
				
				
			}
		}, 0, 10000);
		System.out.println("Agendamos una tarea inmediata que se repite cada 10 segundos ...");
		
		
	}

}
