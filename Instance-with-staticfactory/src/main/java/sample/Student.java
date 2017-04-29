package sample;

public class Student {
	private String name;
	private static Student clientService = new Student();

	public Student() {
		System.out.println("Constructor called");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static Student createInstance() {
		System.out.println("static factory method called");
		return clientService;
	}
}
