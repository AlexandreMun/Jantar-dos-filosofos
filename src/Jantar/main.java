package Jantar;

public class main {

	public static void main(String[] args) {
		
		Garfos garfo1 = new Garfos(1, 5);
		Garfos garfo2 = new Garfos(2, 1);
		Garfos garfo3 = new Garfos(3, 2);
		Garfos garfo4 = new Garfos(4, 3);
		Garfos garfo5 = new Garfos(5, 4);
		
		Filosofo filosofo1 = new Filosofo("1" , garfo1);
		Filosofo filosofo2 = new Filosofo("2" , garfo2);
		Filosofo filosofo3 = new Filosofo("3" , garfo3);
		Filosofo filosofo4 = new Filosofo("4" , garfo4);
		Filosofo filosofo5 = new Filosofo("5" , garfo5);
		
		new Thread(filosofo1).start();
		new Thread(filosofo2).start();
		new Thread(filosofo3).start();
		new Thread(filosofo4).start();
		new Thread(filosofo5).start();

	}

}
