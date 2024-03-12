package dino;

public class Dinosaur {
	private String name;
	private String species;
	private int age;
	private String diet;
	private double size;

	public Dinosaur(String name, String species, int age, String diet, double size) {
		this.name = name;
		this.species = species;
		this.age = age;
		this.diet = diet;
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getDiet() {
		return diet;
	}

	public void setDiet(String diet) {
		this.diet = diet;
	}


	public double getSize() {
		return size;

	}

	public void setSize(double size) {
		this.size = size;
	}

}
