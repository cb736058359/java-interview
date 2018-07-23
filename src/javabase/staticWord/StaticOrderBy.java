package javabase.staticWord;

public class StaticOrderBy {
	public static String staticField = "静态变量";
	public String field = "静态变量";
	static {
		System.out.println("静态代码快");
	}
	{
		System.out.println("普通代码块");
	}
	
	public StaticOrderBy() {
		super();
		System.out.println("构造方法");
	}

	public static void main(String[] args) {
		new StaticOrderBy();
	}
}
