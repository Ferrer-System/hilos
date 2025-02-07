package javaDesdeCeroThread.com.hilos.ejemploexecutor;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class EjemploExecutor {

	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

		ExecutorService executor = Executors.newSingleThreadExecutor();
		
		Callable<String> tareaRunnable = () ->{
			System.out.println("Inicio de tarea...");
			try {
				System.out.println("Nombre del Thread: " + Thread.currentThread().getName());
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				e.printStackTrace();
			}
			System.out.println("Finaliza la tarea...");
			return "Algun resultado importante de la tarea";
		};
		
		Future<String> resultado = executor.submit(tareaRunnable);
		executor.shutdown();
		
		System.out.println("Continuando con la ejecucion del metodo main "); 

		//System.out.println(resultado.isDone());
		while (!resultado.isDone()) {
			System.out.println("Ejecutando tarea ...");
			TimeUnit.MILLISECONDS.sleep(15000);
			
		}
		
		System.out.println("Continuando...");

		System.out.println("Obtenemos un resultado: " + resultado.get());
		System.out.println("Finaliza la tarea: " + resultado.isDone());
		
		
	}

}
