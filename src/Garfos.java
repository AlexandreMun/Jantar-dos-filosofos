//import java.util.Random;
//
//public class Garfos extends Thread {
//	private final int garfoEsquerda;
//	private final int garfoDireita;
//
//	public int getGarfoEsquerda() {
//		return garfoEsquerda;
//	}
//
//	public int getGarfoDireita() {
//		return garfoDireita;
//	}
//	
//	public Garfos (int garfoEsquerda, int garfoDireita) {
//		this.garfoEsquerda = garfoEsquerda;
//		this.garfoDireita = garfoDireita;
//	}
//		
//	//	Executa a Thread
//	public void run () {
//		while (true) {
//			try {
//				SorteioDireita();
//				SorteioEsquerda();
//				Thread.sleep(3000);
//			} catch (InterruptedException ex) {
//				System.out.println(ex);
//			}
//		}
//	}
//		
//	//	Sorteio do garfo da direita
//	public void SorteioDireita () {
//		int garfoDireita;
//		Random randDir = new Random();
//		garfoDireita = randDir.nextInt(5);
//		
//		System.out.println("Garfo da direita: " + garfoDireita);
//	}
//		
//	//	Sorteio do garfo da esquerda
//	public void SorteioEsquerda () {
//		int garfoEsquerda;
//		Random randEsq = new Random();
//		garfoEsquerda = randEsq.nextInt(5);
//			
//		System.out.println("Garfo da esquerda: " + garfoEsquerda);
//	}
//
//}

//package Jantar;

import java.util.Random;

public class Garfos extends Thread {
	private final int garfoDireita;
	private final int garfoEsquerda;
	
	//	Getters
	public int getGarfoDireita() {
		return garfoDireita;
	}
	public int getGarfoEsquerda() {
		return garfoEsquerda;
	}

	//	Constructor
	public Garfos(int garfoDireita, int garfoEsquerda) {
		this.garfoDireita = garfoDireita;
		this.garfoEsquerda = garfoEsquerda;
	}

	//	Executa a Thread
	public void run() {
		while (true) {
			try {
				garfoMaoDireita();
				garfoMaoEsquerda();
				Thread.sleep(3000);
			} catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}

	//	Sorteio os garfos das mãos
	public void garfoMaoDireita() {
		int garfoDireita;
		
		Random randDireita = new Random();
		garfoDireita = randDireita.nextInt(5);
		
		System.out.println("Garfo da mão direita: " + garfoDireita);
	}
	
	public void garfoMaoEsquerda() {
		int garfoEsquerda;
		
		Random randEsquerda = new Random();
		garfoEsquerda = randEsquerda.nextInt(5);
		
		System.out.println("Garfo da mão esquerda: " + garfoEsquerda);
	}
	
	
	
}