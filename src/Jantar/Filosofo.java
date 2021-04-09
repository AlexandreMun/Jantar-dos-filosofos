package Jantar;

public class Filosofo extends Thread {
	String nome;
	Garfos garfo;
	
	public Filosofo(String nome, Garfos garfo) {
		this.nome = nome;
		this.garfo = garfo;
		
		System.out.println("O fil�sofo " + nome + " sentou na mesa.");
	}
	
	//	Se o filosofo n�o estiver comendo vai estar pensando
	public void pensar() throws InterruptedException {
		//	Espera at� os garfos estarem dispon�veis
		System.out.println("O fil�sofo " + nome + " est� pensando.");
		Thread.sleep(3000);
	}
	
	//	Executa a Thread
	public void run() {
		while(true) {
			//	Fil�sofo 1 = Pode ter os garfos 5 e 1
			if(garfo.getGarfoDireita() == 5) {
				System.out.println("O fil�sofo " + nome + " pegou o garfo " + garfo.getGarfoDireita());
				
				if(garfo.getGarfoEsquerda() == 1) {
					System.out.println("O fil�sofo " + nome + " pegou o garfo " + garfo.getGarfoEsquerda());
					System.out.println("O fil�sofo " + nome + " est� comendo.");
					System.out.println("O fil�sofo " + nome + " colocou os garfos na mesa.");
				} else {
					System.out.println("O fil�sofo " + nome + " colocou o garfo " + garfo.getGarfoDireita() + " na mesa.");
				}
			} else {
				try {
					pensar();
				} catch(InterruptedException e) {
					System.out.println(e);
				}
			}
			
			//	Fil�sofo 2 = Pode ter os garfos 1 e 2
			if(garfo.getGarfoDireita() == 1) {
				System.out.println("O fil�sofo " + nome + " pegou o garfo " + garfo.getGarfoDireita());
				
				if(garfo.getGarfoEsquerda() == 2) {
					System.out.println("O fil�sofo " + nome + " pegou o garfo " + garfo.getGarfoEsquerda());
					System.out.println("O fil�sofo " + nome + " est� comendo.");
					System.out.println("O fil�sofo " + nome + " colocou os garfos na mesa.");
				} else {
					System.out.println("O fil�sofo " + nome + " colocou o garfo " + garfo.getGarfoDireita() + " na mesa.");
				}
			} else {
				try {
					pensar();
				} catch(InterruptedException e) {
					System.out.println(e);
				}
			}
			
			//	Fil�sofo 3 = Pode ter os garfos 2 e 3
			if(garfo.getGarfoDireita() == 2) {
				System.out.println("O fil�sofo " + nome + " pegou o garfo " + garfo.getGarfoDireita());
				
				if(garfo.getGarfoEsquerda() == 3) {
					System.out.println("O fil�sofo " + nome + " pegou o garfo " + garfo.getGarfoEsquerda());
					System.out.println("O fil�sofo " + nome + " est� comendo.");
					System.out.println("O fil�sofo " + nome + " colocou os garfos na mesa.");
				} else {
					System.out.println("O fil�sofo " + nome + " colocou o garfo " + garfo.getGarfoDireita() + " na mesa.");
				}
			} else {
				try {
					pensar();
				} catch(InterruptedException e) {
					System.out.println(e);
				}
			}
			
			//	Fil�sofo 4 = Pode ter os garfos 3 e 4
			if(garfo.getGarfoDireita() == 3) {
				System.out.println("O fil�sofo " + nome + " pegou o garfo " + garfo.getGarfoDireita());
				
				if(garfo.getGarfoEsquerda() == 4) {
					System.out.println("O fil�sofo " + nome + " pegou o garfo " + garfo.getGarfoEsquerda());
					System.out.println("O fil�sofo " + nome + " est� comendo.");
					System.out.println("O fil�sofo " + nome + " colocou os garfos na mesa.");
				} else {
					System.out.println("O fil�sofo " + nome + " colocou o garfo " + garfo.getGarfoDireita() + " na mesa.");
				}
			} else {
				try {
					pensar();
				} catch(InterruptedException e) {
					System.out.println(e);
				}
			}
			
			//	Fil�sofo 5 = Pode ter os garfos 4 e 5
			if(garfo.getGarfoDireita() == 4) {
				System.out.println("O fil�sofo " + nome + " pegou o garfo " + garfo.getGarfoDireita());
				
				if(garfo.getGarfoEsquerda() == 5) {
					System.out.println("O fil�sofo " + nome + " pegou o garfo " + garfo.getGarfoEsquerda());
					System.out.println("O fil�sofo " + nome + " est� comendo.");
					System.out.println("O fil�sofo " + nome + " colocou os garfos na mesa.");
				} else {
					System.out.println("O fil�sofo " + nome + " colocou o garfo " + garfo.getGarfoDireita() + " na mesa.");
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
