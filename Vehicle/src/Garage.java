import java.util.List;

public class Garage {
	List<Vehicle> vehicles = new ArrayList<Vehicle>[] {
		
	 private List<Vehicle> empty public List<Vehicle> getVehicles() {
		return vehicles;
	 }
	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}
	Vehicle() {
			Vehicle clear() 
			return vehicles;
		}

	public List<Vehicle> add Vehicle(Vehicle vehicle) {
		vehicles.add(vehicle);
			return vehicles;
	}
	 public List<Vehicle> removeVehicle(int id) {
	 for(Vehicle vehicle: vehicles) {
		 if(vehicle.getId()==id) {
			 vehicles.remove(vehicle);
			 return vehicles;
		 	}
	 	}
	 }
	
