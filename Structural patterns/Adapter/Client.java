/*
  	Convert the interface of a class into another interface that clients expect.
  	Adapter lets classes work together that could not otherwise because of incompatible interfaces

 */

package adapter;

public class Client {

	public static void main(String[] args) {

		Tank panzer = new Tank();
		Robot m3000 = new Robot();
		Attacker robotTank = new TankAdapter(panzer);

		System.out.println("Tank attacks");
		panzer.assignDriver("Franz");
		panzer.driveForward();
		panzer.fireWeapon();

		System.out.println("\n================\n");

		System.out.println("Robot attacks"); // enemy robot is a tank driven by an AI system
		m3000.moveForward();
		m3000.attack();
		m3000.reactToHuman("Heinrich");

		System.out.println("\n================\n");

		System.out.println("Robot tank with adapter"); // enemy robot is controlled by Paul and acts as a normal tank
		robotTank.reactToHuman("Paul");
		robotTank.moveForward();
		robotTank.attack();

	}

}

