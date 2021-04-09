package Jantar;

import java.util.Random;

public class Garfos extends Thread {
	private int garfoEsquerda;
	private int garfoDireita;

	public int getGarfoEsquerda() {
		return garfoEsquerda;
	}
	
	public int getGarfoDireita() {
		return garfoDireita;
	}
	
	public Garfos (int garfoEsquerda, int garfoDireita) {
		this.garfoEsquerda = garfoEsquerda;
		this.garfoDireita = garfoDireita;
	}
		
	//	Executa a Thread
	public void run () {
		while (true) {
			try {
				//	Sorteia os garfos da mão direita e da mão esquerda
				Random randDir = new Random();
				Random randEsq = new Random();
				
				this.garfoDireita = randDir.nextInt(5);
				this.garfoEsquerda = randEsq.nextInt(5);
				
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
		

}