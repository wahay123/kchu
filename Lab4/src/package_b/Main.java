package package_b;

import package_a.StudentFromA;

public class Main {
	public static void main(String args[]) {
		String s = "a";
		int i;

		try {
			i = Integer.parseInt(s);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Integer parseInt");
			i = -1;
		}

		double j;
		try {
			j = Double.parseDouble(s);
		} catch (Exception e) {
			j = 1.0;
		}

		System.out.println(i);
		System.out.println(j);

	}

}
