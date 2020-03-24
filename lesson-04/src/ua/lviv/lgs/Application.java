package ua.lviv.lgs;

public class Application {
	public static void main(String[] args) {
		
		Robot r = new Robot();
        CoffeRobot c = new CoffeRobot();
        RobotCoocker ck = new RobotCoocker();
        RobotDancer d = new RobotDancer();

        Robot [] robots = {r, c, ck, d};

        for (int i = 0; i < robots.length; i++) {
            robots[i].work();
        }
	}

}
