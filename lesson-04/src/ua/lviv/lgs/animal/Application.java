package ua.lviv.lgs.animal;

public class Application {
	public static void main(String[] args) {
		
		Animal a = new Animal("�������", 20, 7);
		System.out.println(a);
		System.out.println("---------------------------");
		a.setAge(14);
		a.setName("���");
		a.setSpeed(2);
		System.out.println(a);
	}

}
