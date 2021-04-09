public class main {

	public static void main(String[] args) {
//		Filosofos f = new Filosofos();
//		f.test();
		

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
