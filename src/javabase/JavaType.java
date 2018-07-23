package javabase;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class JavaType {

	public static void main(String[] args) {
		Integer x = 2;// 装箱
		int y = 2;// 拆箱
		System.out.println(x == y);

		/* 包装类数据池 */
		Integer x1 = new Integer(123);
		Integer y1 = new Integer(123);
		System.out.println(x1 == y1);
		Integer x2 = Integer.valueOf(127);
		Integer y2 = Integer.valueOf(127);
		System.out.println(x2 == y2);

		String str1 = new String("helloworld");
		String str2 = "helloworld";
		System.out.println(str1.intern() == str2);

		float f = 1.1f;
		f += 1;
		System.out.println(f);

		String s = "b";
		switch (s) {
		case "a":
			System.out.println("aaa");
			break;
		default:
			System.out.println("bbb");
			break;
		}

		double d = f;
		System.out.println(d);

		short s1 = 1;
		s1 = (short) (1 + s1);
		System.out.println(s1);

		EqualExample e1 = new EqualExample(1, 1, 1);
		EqualExample e2 = new EqualExample(1, 1, 1);
		System.out.println(e1.equals(e2)); // true
		HashSet<EqualExample> set = new HashSet<>();
		System.out.println(e1 + "==" + e2);
		set.add(e1);
		set.add(e2);
		System.out.println(set.size());

		/*final int z = 1;
		z = 2;*/
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		//迭代器设计模式
		for (int i = 0; i < args.length; i++) {
			String string = args[i];
		}
		for (Integer integer : list) {
			
		}
		list.toArray();
		
		System.out.println(5+(5>>1));
		System.out.println(5>>2);
	}

}
