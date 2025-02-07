package javaDesdeCeroThread.com.hilos.tareas;

public class AlfanumericoMain {

	public static void main(String[] args) {

		Thread hiloNumero = new Thread(new AlfanumericoTarea(Tipo.NUMERO));
		Thread hiloLetra = new Thread(new AlfanumericoTarea(Tipo.LETRA));
		
		hiloNumero.start();
		hiloLetra.start();
	}

}
