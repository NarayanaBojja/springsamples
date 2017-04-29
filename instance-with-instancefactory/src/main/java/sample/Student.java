package sample;

public class Student {
	private String name;
	
	public Student() {
		System.out.println("Constructor called");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
