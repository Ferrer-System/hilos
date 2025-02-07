package javaDesdeCeroThread.com.hilos.ejemploexecutor;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class EjemploExecutorFuture2 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
		
		System.out.println("Tamaño deñ Pool: " + executor.getPoolSize());
		System.out.println("Cantidad de tareas en cola: " + executor.getQueue().size());
		
		Callable<String> tarea = () -> {
			System.out.println("Inicio de la tarea...");
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
		
		Callable<Integer> tarea2 = () ->{
			System.out.println("Iniciando tarea 3 ...");
			TimeUnit.SECONDS.sleep(3);
			return 10;
		};
		
		Future<String> resultado = executor.submit(tarea);
		Future<String> resultado2 = executor.submit(tarea);
		Future<Integer> resultado3 = executor.submit(tarea2);
		
		System.out.println("Tamaño del Pool: " + executor.getPoolSize());
		System.out.println("Cantidad de tareas en cola: " + executor.getQueue().size());

		executor.shutdown();
		
		System.out.println("Continuando con la ejecucion del metodo main "); 

		//System.out.println(resultado.isDone());
		while (!(resultado.isDone() && resultado2.isDone() && resultado3.isDone())) {
			System.out.println(String.format("Resultado1: %s - Resultado2: %s - Resultado3: %s",
				resultado.isDone()? "Finalizo": "En proceso",
				resultado2.isDone()? "Finalizo": "En proceso",
				resultado3.isDone()? "Finalizo": "En proceso"));
			TimeUnit.MILLISECONDS.sleep(1000);
			
		}
		
		System.out.println("Continuando...");

		System.out.println("Obtenemos un resultado: " + resultado.get());
		System.out.println("Finaliza la tarea: " + resultado.isDone());
		
		System.out.println("Obtenemos un resultado2: " + resultado2.get());
		System.out.println("Finaliza la tarea: " + resultado2.isDone());
		
		System.out.println("Obtenemos un resultado3: " + resultado3.get());
		
	}

}
