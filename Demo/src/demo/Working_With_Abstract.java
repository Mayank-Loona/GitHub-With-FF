package demo;

abstract class Demo2 {
	public abstract void m1();

	public void m2() {
		System.out.println("M2 is executing");
	}

	public static void m3() {
		System.out.println("M3 is executing");
	}
}

class Sample1 extends Demo2 {
	public void m1() {
		System.out.println("M1 is executing");
	}
}

public class Working_With_Abstract {
	public static void main(String[] args) {
		Sample1 s = new Sample1();
		s.m1();
		s.m3();
		s.m2();
	}
}
