package javabase.staticWord;

public class MyInnerClass {
	private static int x;
	private int y;

	class InnerClass {

	}

	static class StaticInnerCLass {

	}

	public static void main(String[] args) {
		MyInnerClass myInnerClass = new MyInnerClass();
		InnerClass innerClass = myInnerClass.new InnerClass();// 非静态内部类
		StaticInnerCLass staticInnerCLass = new StaticInnerCLass();// 静态内部类
	}
}
