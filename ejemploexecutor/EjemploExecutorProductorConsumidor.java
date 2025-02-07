package javaDesdeCeroThread.com.hilos.ejemploexecutor;

import java.util.concurrent.ExecutionException;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

import javaDesdeCeroThread.com.hilos.ejemplosync.Panaderia;
import javaDesdeCeroThread.com.runnable.Consumidor;
import javaDesdeCeroThread.com.runnable.Panadero;

public class EjemploExecutorProductorConsumidor {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
		
		System.out.println("Tamaño del Pool: " + executor.getPoolSize());
		System.out.println("Cantidad de tareas en cola: " + executor.getQueue().size());
	
		Panaderia p = new Panaderia();
		Runnable productor = new Panadero(p);
		Runnable consumidor = new Consumidor(p);
		Future<?> future1 = executor.submit(productor);
		Future<?> futuro1 = executor.submit(consumidor);
		
		
		
		System.out.println("Tamaño del Pool: " + executor.getPoolSize());
		System.out.println("Cantidad de tareas en cola: " + executor.getQueue().size());

		executor.shutdown();
		
		System.out.println("Continuando con la ejecucion del metodo main "); 

		
	}

}
