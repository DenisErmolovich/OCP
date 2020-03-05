package by.ocp.chpt01;

public class PlayWithLion {
	public static void main(String... args) {
		Animal animal = new Lion();
		animal.printName();
	}
}

abstract class Animal {
	String name = "???";

	String getName() {
		return name;
	}

	public void printName() {
		System.out.println(getName()); //Output: ???
	}
}

class Lion extends Animal {
	String name = "Leo";

	// @Override //Output: Leo
	// String getName() {
	// 	return name;
	// }
}
