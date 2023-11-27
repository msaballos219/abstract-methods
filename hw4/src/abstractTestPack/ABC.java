package abstractTestPack;

public abstract class ABC {
	ABC() {
		System.out.println("Initializing ABC Class");
	}
	
	void foo() {
		System.out.println("Foo");
	}
	abstract String day();
}
