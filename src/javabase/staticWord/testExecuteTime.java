package javabase.staticWord;

public class testExecuteTime {
	public static void main(String[] args) {
		int n = 10000000;
		int count = 0;
		long firstTime = System.currentTimeMillis();

		for (int i = 0; i < n; i++) {
			count = count + i;
		}

		// count = (n * (n + 1)) / 2;
		System.out.println(count);
		long lastTime = System.currentTimeMillis();
		System.out.println(lastTime - firstTime);
	}
}
