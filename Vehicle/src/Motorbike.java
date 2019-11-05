
public class Motorbike extends Vehicle {
	public boolean StuntPegs;
	
	public Motorbike(int id, boolean StuntPegs) {
		super(id, "Motorbike");
		this.StuntPegs = StuntPegs;
	}
	public int bill () {
		return 100;
	}
	public boolean isStuntPegs() {
		return StuntPegs;
	}
	public void setStuntPegs(boolean stuntPegs) {
		StuntPegs = stuntPegs;
	}
}
