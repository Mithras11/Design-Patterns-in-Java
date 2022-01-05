package adapter;

public class TankAdapter implements Attacker {

	private Tank tank;

// ctor
	public TankAdapter(Tank tank) {
		this.tank = tank;
	}

//adapting methods
	@Override
	public void attack() {
		this.tank.fireWeapon();

	}

	@Override
	public void moveForward() {
		this.tank.driveForward();

	}

	@Override
	public void reactToHuman(String humanName) {
		this.tank.assignDriver(humanName);

	}

}
