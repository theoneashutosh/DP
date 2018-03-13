package strategy;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallordDuck = new MallardDuck();
		mallordDuck.setFlyBehaviour(new FlyWithWings());
		mallordDuck.setQuackBehaviour(new Quack());
		mallordDuck.display();
		mallordDuck.swim();
		mallordDuck.performFly();
		mallordDuck.performQuack();
		
		System.out.println("--------------------------------------------");
		Duck plasticDuck = new PlasticDuck();
		plasticDuck.setFlyBehaviour(new NoFly());
		plasticDuck.setQuackBehaviour(new Squeak());
		plasticDuck.display();
		plasticDuck.swim();
		plasticDuck.performFly();
		plasticDuck.performQuack();
		
	}
}
