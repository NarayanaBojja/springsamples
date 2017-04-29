package sample;

public class Student1 {
	private String name;

	public Student1(NameSource nameSource) {
		this.name = nameSource.name;
	}

	public String getName() {
		return name;
	}

}
