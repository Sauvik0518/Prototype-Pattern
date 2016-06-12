package iit.du.ac.bd;

public class PrototypePatternMain {
	public static void main(String[] args) {

		Person person1 = new Person("Anik");
		System.out.println("person 1:" + person1);
		Person person2 = (Person) person1.clone();
		System.out.println("person 2:" + person2);
	}
}
