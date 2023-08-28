package Week2;

public class Pet {
	// Attributes
	private String name;
	private int age;
	private String voice;
	private boolean vaccinated;

	// Constructors
	Pet() {
		name = "";
		age = 0;
		voice = "";
		vaccinated = false;
	}// end of constructor Pet

	public Pet(String n, int a, String v, boolean vac) {
		name = n;
		age = a;
		voice = v;
		vaccinated = vac;
	}// end of constructor

	// Methods
	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int a) {
		age = a;
	}

	public String getVoice() {
		return voice;
	}

	public String setVoice(String v) {
		return voice;
	}

	public boolean getVaccinated() {
		return vaccinated;
	}

	public void setVaccinated(boolean vac) {
		vaccinated = vac;
	}
}// end of class pet
