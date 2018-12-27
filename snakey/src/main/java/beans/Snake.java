package beans;

public class Snake {

	public Snake(int snake_ID, String firstName, String species, int age, int h_ID) {
		super();
		this.snake_ID = snake_ID;
		this.firstName = firstName;
		this.species = species;
		this.age = age;
		this.h_ID = h_ID;
	}
	
	public Snake( String firstName, String species, int age, int h_ID) {
		super();
	
		this.firstName = firstName;
		this.species = species;
		this.age = age;
		this.h_ID = h_ID;
	}
	public Snake() {
		
	}

	//SNAKE_ID INTEGER PRIMARY KEY,
	//FIRSTNAME VARCHAR2(30),
	//SPECIES VARCHAR2(30),
	//AGE INTEGER,
	//H_ID INTEGER
	
	private int snake_ID;
	private String firstName;
	private String species;
	private int age;
	private int h_ID;
	@Override
	public String toString() {
		return "snakes [snake_ID=" + snake_ID + ", firstName=" + firstName + ", species=" + species + ", age=" + age
				+ ", h_ID=" + h_ID + "]";
	}
	public int getSnake_ID() {
		return snake_ID;
	}
	public void setSnake_ID(int snake_ID) {
		this.snake_ID = snake_ID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getH_ID() {
		return h_ID;
	}
	public void setH_ID(int h_ID) {
		this.h_ID = h_ID;
	}
	
	
}
