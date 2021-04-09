import java.util.Random;

public class Filosofos{
	
	//	
	public class Filosofo extends Thread {
		String nome;
		Garfos garfo;
		int cadeira;
		
		public Filosofo (String nome, Garfos garfo) {
			this.nome = nome;
			this.garfo = garfo;
			
			System.out.println("O filósofo " + nome + " sentou na mesa.");
		}
		
//		Se não está comendo está pensando
		public void Pensar () throws InterruptedException {
//			Espera até um garfo estar disponivel
			System.out.println("O filósofo " + nome + " está pensando.");
			Thread.sleep(3000);
		}
		
		//	Executa a Thread
		public void run () {
			while (true) {
				//	Sorteio dos garfos do filosofo 1
				if(garfo.getGarfoDireita() == 5) {
					System.out.println("O filósofo " + nome + " pegou o garfo " + garfo.getGarfoDireita());
					
					if(garfo.getGarfoEsquerda() == 1) {
						System.out.println("O filósofo " + nome + " pegou o garfo " + garfo.getGarfoEsquerda());
						System.out.println("O filósofo " + nome + " está comendo.");
						System.out.println("O filósofo " + nome + " largou os dois garfos.");
					} else {
						System.out.println("O filósofo " + nome + " largou o garfo " + garfo.getGarfoDireita());
					}
				} else {
					try {
						Pensar();
					} catch (InterruptedException ex) {
//						Logger.getLogger(Filosofos.class.getName()).log(Level.SEVERE, null, ex);
						System.out.println(ex);
					}
				}
				
				//	Sorteio dos garfos do filosofo 2
				if(garfo.getGarfoDireita() == 1) {
					System.out.println("O filósofo " + nome + " pegou o garfo " + garfo.getGarfoDireita());
					
					if(garfo.getGarfoEsquerda() == 2) {
						System.out.println("O filósofo " + nome + " pegou o garfo " + garfo.getGarfoEsquerda());
						System.out.println("O filósofo " + nome + " está comendo.");
						System.out.println("O filósofo " + nome + " largou os dois garfos.");
					} else {
						System.out.println("O filósofo " + nome + " largou o garfo " + garfo.getGarfoDireita());
					}
				} else {
					try {
						Pensar();
					} catch (InterruptedException ex) {
//						Logger.getLogger(Filosofos.class.getName()).log(Level.SEVERE, null, ex);
						System.out.println(ex);
					}
				}

				//	Sorteio dos garfos do filosofo 3
				if(garfo.getGarfoDireita() == 2) {
					System.out.println("O filósofo " + nome + " pegou o garfo " + garfo.getGarfoDireita());
					
					if(garfo.getGarfoEsquerda() == 3) {
						System.out.println("O filósofo " + nome + " pegou o garfo " + garfo.getGarfoEsquerda());
						System.out.println("O filósofo " + nome + " está comendo.");
						System.out.println("O filósofo " + nome + " largou os dois garfos.");
					} else {
						System.out.println("O filósofo " + nome + " largou o garfo " + garfo.getGarfoDireita());
					}
				} else {
					try {
						Pensar();
					} catch (InterruptedException ex) {
//						Logger.getLogger(Filosofos.class.getName()).log(Level.SEVERE, null, ex);
						System.out.println(ex);
					}
				}

				//	Sorteio dos garfos do filosofo 4
				if(garfo.getGarfoDireita() == 3) {
					System.out.println("O filósofo " + nome + " pegou o garfo " + garfo.getGarfoDireita());
					
					if(garfo.getGarfoEsquerda() == 4) {
						System.out.println("O filósofo " + nome + " pegou o garfo " + garfo.getGarfoEsquerda());
						System.out.println("O filósofo " + nome + " está comendo.");
						System.out.println("O filósofo " + nome + " largou os dois garfos.");
					} else {
						System.out.println("O filósofo " + nome + " largou o garfo " + garfo.getGarfoDireita());
					}
				} else {
					try {
						Pensar();
					} catch (InterruptedException ex) {
//						Logger.getLogger(Filosofos.class.getName()).log(Level.SEVERE, null, ex);
						System.out.println(ex);
					}
				}

				//	Sorteio dos garfos do filosofo 5
				if(garfo.getGarfoDireita() == 4) {
					System.out.println("O filósofo " + nome + " pegou o garfo " + garfo.getGarfoDireita());
					
					if(garfo.getGarfoEsquerda() == 5) {
						System.out.println("O filósofo " + nome + " pegou o garfo " + garfo.getGarfoEsquerda());
						System.out.println("O filósofo " + nome + " está comendo.");
						System.out.println("O filósofo " + nome + " largou os dois garfos.");
					} else {
						System.out.println("O filósofo " + nome + " largou o garfo " + garfo.getGarfoDireita());
					}
				} else {
					try {
						Pensar();
					} catch (InterruptedException ex) {
//						Logger.getLogger(Filosofos.class.getName()).log(Level.SEVERE, null, ex);
						System.out.println(ex);
					}
				}
			}
		}
	}
	
	
//		Criando os garfos
//	public class Garfos extends Thread {
//		private final int garfoEsquerda;
//		private final int garfoDireita;
//		
//		public Garfos (int garfoEsquerda, int garfoDireita) {
//			this.garfoEsquerda = garfoEsquerda;
//			this.garfoDireita = garfoDireita;
//		}
//		
//		//	Executa a Thread
//		public void run () {
//			while (true) {
//				try {
//					SorteioDireita();
//					SorteioEsquerda();
//					Thread.sleep(1000);
//				} catch (InterruptedException ex) {
//					System.out.println(ex);
//				}
//			}
//		}
//		
//		//	Sorteio do garfo da direita
//		public void SorteioDireita () {
//			int garfoDireita;
//			Random randDir = new Random();
//			garfoDireita = randDir.nextInt(5);
//			
//			System.out.println("Garfo da direita: " + garfoDireita);
//		}
//		
//		//	Sorteio do garfo da esquerda
//		public void SorteioEsquerda () {
//			int garfoEsquerda;
//			Random randEsq = new Random();
//			garfoEsquerda = randEsq.nextInt(5);
//			
//			System.out.println("Garfo da esquerda: " + garfoEsquerda);
//		}
//		
//		
//		//	
//		
//	}

	
	public void test () {
		Garfos g1 = new Garfos(1, 5);
		Garfos g2 = new Garfos(2, 1);
		Garfos g3 = new Garfos(3, 2);
		Garfos g4 = new Garfos(4, 3);
		Garfos g5 = new Garfos(5, 4);
		
		Filosofo filosofo1 = new Filosofo("Filósofo 1", g1);
		Filosofo filosofo2 = new Filosofo("Filósofo 2", g2);
		Filosofo filosofo3 = new Filosofo("Filósofo 3", g3);
		Filosofo filosofo4 = new Filosofo("Filósofo 4", g4);
		Filosofo filosofo5 = new Filosofo("Filósofo 5", g5);
		
		new Thread(filosofo1).start();
		new Thread(filosofo2).start();
		new Thread(filosofo3).start();
		new Thread(filosofo4).start();
		new Thread(filosofo5).start();
	}
	

}
