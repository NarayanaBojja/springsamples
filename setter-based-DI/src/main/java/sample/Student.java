package sample;

public class Student {
	private NameSource nameSource;

	public void setNameSource(NameSource nameSource) {
		this.nameSource = nameSource;
	}

	public String getName() {
		return this.nameSource.name;
	}
}
