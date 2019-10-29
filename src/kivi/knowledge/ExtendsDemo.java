package kivi.knowledge;

public class ExtendsDemo {
	public static void main(String[] args) {
		Dota one=new Dota();
		one.launch();
		one.start();
	}
}

class Game{
	String name="Game";
	double version;
	String agent;
	public Game(){
		System.out.println("Game");
	}
	public void start() {
		System.out.println("start");
	}
	
	public void end() {
		System.out.println("end");
	}
}

class Dota extends Game{
	String name="Dota";
	public Dota() {
		System.out.println("Dota");
	}
	public void launch() {
		System.out.println(name+"launch");
		System.out.println(super.name+"launch");
	}
	public void start() {
		System.out.println("Dotastart");
	}
}
class LOL extends Game{
	
}