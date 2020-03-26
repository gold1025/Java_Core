package ua.lviv.lgs.pet;

public class Application {
public static void main(String[] args) {
	 
	Cat ct = new Cat();
	Dog d = new Dog();
	Cow c = new Cow();
	
	ct.voice();
	d.voice();
	c.voice();
	
	System.out.println(ct);
	System.out.println(d);
	System.out.println(c);
}
}
