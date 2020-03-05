package by.ocp.chpt01.species;

import by.ocp.chpt01.*;

public class Lynx extends BigCat {
	public static void main(String... args) {
		BigCat cat = new BigCat();
		System.out.println(cat.name);
		System.out.println(cat.hasFur); // Compile error. Access via variable does not benefit from protected
		// System.out.println(cat.hasPaws); Unavailable because of package private
		// System.out.println(cat.id); // Unavailable because of private
	}
}
