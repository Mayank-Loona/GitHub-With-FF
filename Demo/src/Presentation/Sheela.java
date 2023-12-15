package Presentation;

public class Sheela {
	public void test() {
		System.out.println(10/0);
	}
	public void test1() {
		test();
	}
	public void test2() {
		test1();
	}
	public static void main(String[] args) {
		new Sheela().test();
	}
}
