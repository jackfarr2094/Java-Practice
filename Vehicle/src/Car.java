
public class Car extends Vehicle {
	private int doors;
	
public Car(int id, int doors) {
		super(id, "Car");
		this.doors = doors;
}
public int bill() {
	return 200;
	}
public int getDoors() {
	return doors;
}
public void setDoors(int doors) {
	this.doors = doors;
}
}