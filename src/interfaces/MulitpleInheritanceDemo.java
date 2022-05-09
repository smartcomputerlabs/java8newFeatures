package interfaces;

//public class MulitpleInheritanceDemo implements A1, B1 { // compilation error implement doStuff
//public class MulitpleInheritanceDemo implements A2, B1 { // compilation error implement doStuff as B1 doesn't override doStuff, but has it's pwn doStuff
//	public class MulitpleInheritanceDemo implements A1, B2 { // allowed doStuff from B2 invoked, as doStuff of A1 is overridden in B2
//	public class MulitpleInheritanceDemo implements A2, B2 { // allowed doStuff from B2 invoked, as doStuff of A2 is overridden in B2
public class MulitpleInheritanceDemo implements A3 { // compilation error implement doStuff
	public static void main(String[] args) {
		new MulitpleInheritanceDemo().doStuff();
	}

	@Override
	public void doStuff() {
		// TODO Auto-generated method stub
		//B1.super.doStuff();
	}

}

interface A1 {
	default void doStuff() {
		System.out.println("A1.doStuff()");
	}
}

interface A2 extends A1 {
}

interface A3 extends A1 {
	void doStuff();
}

interface B1 {
	default void doStuff() { // line n1
		System.out.println("B1.doStuff()");
	}
}

interface B2 extends A1 {
	default void doStuff() { // line n1
		System.out.println("B1.doStuff()");
	}
}
