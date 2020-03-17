package by.ocp.chpt01;

public class AnonymousClass {
	private abstract class ClassExample {
		public void doSomethingClass() {
			System.out.println("ClassExample");
		}
	}

	private interface InterfaceExample {
		void doSomethingInterface();
	}

	private void doSomething() {
		new ClassExample() {}.doSomethingClass();
		new ClassExample() implements InterfaceExample { // Can't implements interfaces
			public void doSomethingInterface() {
				System.out.println("InterfaceExample");
			}
		}.doSomethingInterface();
	}

	public static void main(String... args) {
		new AnonymousClass().doSomething();
	}
}