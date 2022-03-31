package ch5;

public class CharOccurCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "malayalam"; // maly
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == 'm')
				count++;
		}

		System.out.println("m:" + count);
		count = 0;

		for (int i = 0; i <= name.length() - 1; i++) {
			if (name.charAt(i) == 'a')
				count++;
		}

		System.out.println("a:" + count);
		count = 0;

		for (int i = 0; i <= name.length() - 1; i++) {
			if (name.charAt(i) == 'l')
				count++;
		}

		System.out.println("l:" + count);
		count = 0;

		for (int i = 0; i <= name.length() - 1; i++) {
			if (name.charAt(i) == 'y')
				count++;
		}
		System.out.println("y:" + count);

	}

}
