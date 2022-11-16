package Pattern_tuf;

public class class3 {

	public static void main(String[] args) {

		int lines = 5;
		int numberprint = 1;
		int value=1;

		for (int i = 0; i < lines; i++) {
			for (int j = 0; j < numberprint; j++) 
			{
				System.out.print(value);
					value++;
			}
			System.out.println();
			value=1;
			numberprint++;
		}
	}
}