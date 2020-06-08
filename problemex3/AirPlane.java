package problemex3;

abstract class AirPlane {
	private String type;
	
	public AirPlane(String type) {
		this.type = type;
	}
	
	public String getType() {
		return this.type;
	}
	
	abstract void fly();
}
