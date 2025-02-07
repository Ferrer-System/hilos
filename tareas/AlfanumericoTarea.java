package javaDesdeCeroThread.com.hilos.tareas;

public class AlfanumericoTarea implements Runnable{
	private Tipo tipo;

	public AlfanumericoTarea(Tipo tipo) {
		super();
		this.tipo = tipo;
	}

	@Override
	public void run() {

		if (tipo == Tipo.NUMERO) {
			for (int i = 0; i < 10; i++) {
				System.out.println("Numero: " + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}
			}
		}else if (tipo == Tipo.LETRA) {
			for (char c = 'A'; c <= 'J'; c++) {
				System.out.println("Letra: " + c);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}

			}
		
		}
		
	}

}
