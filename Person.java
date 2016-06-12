package iit.du.ac.bd;

public class Person implements IClone {
	
	String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public IClone clone() {
		return new Person(name);
	}

	public String toString() {
		return "This person is " + name;
	}
}
