package ua.lviv.lgs.amphibia;

public class Application {
	
	public static void main(String[] args) {
		
		Object obj = new Frog();
		Amphibia frog = (Amphibia) obj;
		
		frog.eat();
		frog.sleep();
		frog.swin();
		frog.walk();
		
	}

}
