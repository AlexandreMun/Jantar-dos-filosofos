public class Filosofo extends Thread {
		String nome;
		Garfos garfo;
		int cadeira;
		
		public Filosofo (String nome, Garfos garfo) {
			this.nome = nome;
			this.garfo = garfo;
			
			System.out.println("O fil�sofo " + nome + " sentou na mesa.");
	}
	
//		Se n�o est� comendo est� pensando
	public void Pensar () throws InterruptedException {
//			Espera at� um garfo estar disponivel
		System.out.println("O fil�sofo " + nome + " est� pensando.");
		Thread.sleep(3000);
	}
	
	//	Executa a Thread
	public void run () {
		while (true) {
			//	Sorteio dos garfos do filosofo 1
			if(garfo.getGarfoDireita() == 5) {
				System.out.println("O fil�sofo " + nome + " pegou o garfo " + garfo.getGarfoDireita());
				
				if(garfo.getGarfoEsquerda() == 1) {
					System.out.println("O fil�sofo " + nome + " pegou o garfo " + garfo.getGarfoEsquerda());
					System.out.println("O fil�sofo " + nome + " est� comendo.");
					System.out.println("O fil�sofo " + nome + " largou os dois garfos.");
				} else {
					System.out.println("O fil�sofo " + nome + " largou o garfo " + garfo.getGarfoDireita());
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
				System.out.println("O fil�sofo " + nome + " pegou o garfo " + garfo.getGarfoDireita());
				
				if(garfo.getGarfoEsquerda() == 2) {
					System.out.println("O fil�sofo " + nome + " pegou o garfo " + garfo.getGarfoEsquerda());
					System.out.println("O fil�sofo " + nome + " est� comendo.");
					System.out.println("O fil�sofo " + nome + " largou os dois garfos.");
				} else {
					System.out.println("O fil�sofo " + nome + " largou o garfo " + garfo.getGarfoDireita());
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
				System.out.println("O fil�sofo " + nome + " pegou o garfo " + garfo.getGarfoDireita());
				
				if(garfo.getGarfoEsquerda() == 3) {
					System.out.println("O fil�sofo " + nome + " pegou o garfo " + garfo.getGarfoEsquerda());
					System.out.println("O fil�sofo " + nome + " est� comendo.");
					System.out.println("O fil�sofo " + nome + " largou os dois garfos.");
				} else {
					System.out.println("O fil�sofo " + nome + " largou o garfo " + garfo.getGarfoDireita());
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
				System.out.println("O fil�sofo " + nome + " pegou o garfo " + garfo.getGarfoDireita());
				
				if(garfo.getGarfoEsquerda() == 4) {
					System.out.println("O fil�sofo " + nome + " pegou o garfo " + garfo.getGarfoEsquerda());
					System.out.println("O fil�sofo " + nome + " est� comendo.");
					System.out.println("O fil�sofo " + nome + " largou os dois garfos.");
				} else {
					System.out.println("O fil�sofo " + nome + " largou o garfo " + garfo.getGarfoDireita());
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
				System.out.println("O fil�sofo " + nome + " pegou o garfo " + garfo.getGarfoDireita());
				
				if(garfo.getGarfoEsquerda() == 5) {
					System.out.println("O fil�sofo " + nome + " pegou o garfo " + garfo.getGarfoEsquerda());
					System.out.println("O fil�sofo " + nome + " est� comendo.");
					System.out.println("O fil�sofo " + nome + " largou os dois garfos.");
				} else {
					System.out.println("O fil�sofo " + nome + " largou o garfo " + garfo.getGarfoDireita());
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