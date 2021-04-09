package Jantar;

public class Filosofo extends Thread {
	String nome;
	Garfos garfo;
	
	public Filosofo(String nome, Garfos garfo) {
		this.nome = nome;
		this.garfo = garfo;
		
		System.out.println("O filósofo " + nome + " sentou na mesa.");
	}
	
	//	Se o filosofo não estiver comendo vai estar pensando
	public void pensar() throws InterruptedException {
		//	Espera até os garfos estarem disponíveis
		System.out.println("O filósofo " + nome + " está pensando.");
		Thread.sleep(3000);
	}
	
	//	Executa a Thread
	public void run() {
		while(true) {
			//	Filósofo 1 = Pode ter os garfos 5 e 1
			if(garfo.getGarfoDireita() == 5) {
				System.out.println("O filósofo " + nome + " pegou o garfo " + garfo.getGarfoDireita());
				
				if(garfo.getGarfoEsquerda() == 1) {
					System.out.println("O filósofo " + nome + " pegou o garfo " + garfo.getGarfoEsquerda());
					System.out.println("O filósofo " + nome + " está comendo.");
					System.out.println("O filósofo " + nome + " colocou os garfos na mesa.");
				} else {
					System.out.println("O filósofo " + nome + " colocou o garfo " + garfo.getGarfoDireita() + " na mesa.");
				}
			} else {
				try {
					pensar();
				} catch(InterruptedException e) {
					System.out.println(e);
				}
			}
			
			//	Filósofo 2 = Pode ter os garfos 1 e 2
			if(garfo.getGarfoDireita() == 1) {
				System.out.println("O filósofo " + nome + " pegou o garfo " + garfo.getGarfoDireita());
				
				if(garfo.getGarfoEsquerda() == 2) {
					System.out.println("O filósofo " + nome + " pegou o garfo " + garfo.getGarfoEsquerda());
					System.out.println("O filósofo " + nome + " está comendo.");
					System.out.println("O filósofo " + nome + " colocou os garfos na mesa.");
				} else {
					System.out.println("O filósofo " + nome + " colocou o garfo " + garfo.getGarfoDireita() + " na mesa.");
				}
			} else {
				try {
					pensar();
				} catch(InterruptedException e) {
					System.out.println(e);
				}
			}
			
			//	Filósofo 3 = Pode ter os garfos 2 e 3
			if(garfo.getGarfoDireita() == 2) {
				System.out.println("O filósofo " + nome + " pegou o garfo " + garfo.getGarfoDireita());
				
				if(garfo.getGarfoEsquerda() == 3) {
					System.out.println("O filósofo " + nome + " pegou o garfo " + garfo.getGarfoEsquerda());
					System.out.println("O filósofo " + nome + " está comendo.");
					System.out.println("O filósofo " + nome + " colocou os garfos na mesa.");
				} else {
					System.out.println("O filósofo " + nome + " colocou o garfo " + garfo.getGarfoDireita() + " na mesa.");
				}
			} else {
				try {
					pensar();
				} catch(InterruptedException e) {
					System.out.println(e);
				}
			}
			
			//	Filósofo 4 = Pode ter os garfos 3 e 4
			if(garfo.getGarfoDireita() == 3) {
				System.out.println("O filósofo " + nome + " pegou o garfo " + garfo.getGarfoDireita());
				
				if(garfo.getGarfoEsquerda() == 4) {
					System.out.println("O filósofo " + nome + " pegou o garfo " + garfo.getGarfoEsquerda());
					System.out.println("O filósofo " + nome + " está comendo.");
					System.out.println("O filósofo " + nome + " colocou os garfos na mesa.");
				} else {
					System.out.println("O filósofo " + nome + " colocou o garfo " + garfo.getGarfoDireita() + " na mesa.");
				}
			} else {
				try {
					pensar();
				} catch(InterruptedException e) {
					System.out.println(e);
				}
			}
			
			//	Filósofo 5 = Pode ter os garfos 4 e 5
			if(garfo.getGarfoDireita() == 4) {
				System.out.println("O filósofo " + nome + " pegou o garfo " + garfo.getGarfoDireita());
				
				if(garfo.getGarfoEsquerda() == 5) {
					System.out.println("O filósofo " + nome + " pegou o garfo " + garfo.getGarfoEsquerda());
					System.out.println("O filósofo " + nome + " está comendo.");
					System.out.println("O filósofo " + nome + " colocou os garfos na mesa.");
				} else {
					System.out.println("O filósofo " + nome + " colocou o garfo " + garfo.getGarfoDireita() + " na mesa.");
				}
			} else {
				try {
					pensar();
				} catch(InterruptedException e) {
					System.out.println(e);
				}
			}	
		}
	}
}
