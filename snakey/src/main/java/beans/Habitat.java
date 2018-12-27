package beans;

public class Habitat {

	public Habitat(int h_id, String location, String climate) {
		super();
		this.h_id = h_id;
		this.location = location;
		this.climate = climate;
	}
	
	public Habitat( String location, String climate) {
		super();
		
		this.location = location;
		this.climate = climate;
	}
	public Habitat() {
		// TODO Auto-generated constructor stub
	}
	
//	H_ID INTEGER PRIMARY KEY,
//	LOCATION VARCHAR2(40),
//	CLIMATE VARCHAR2(40)
	
	private int h_id;
	private String location;
	private String climate;
	public int getH_id() {
		return h_id;
	}
	public void setH_id(int h_id) {
		this.h_id = h_id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getClimate() {
		return climate;
	}
	public void setClimate(String climate) {
		this.climate = climate;
	}
	@Override
	public String toString() {
		return "Habitat [h_id=" + h_id + ", location=" + location + ", climate=" + climate + "]";
	}

}
