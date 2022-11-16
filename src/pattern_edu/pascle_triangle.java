package pattern_edu;

public class pascle_triangle {

	public static void main(String[] args) {
		int count = 0;
		int space = 3;
		int number = 0;
		int lines = 7;
		int mid = lines + 1 / 2;

		for (int i = 1; i < lines; i++) {
			if (i <= 4) {
				count = 2 * i - 1;
				number = i;
			} else {
				count = count - 2;
				number = 8 - i;
			}

			for (int j = 1; j <= space; j++) {
				if (i < mid) {
					System.out.print(" ");
					space--;
				} else {
					space++;
					System.out.print(" ");
				}
			}

			for (int k = 1; k <= count; k++) {
				System.out.print(number);
				int midcolumn = count + 1 / 2;
				if (k <= midcolumn) {
					number--;
				} else {
					number++;
				}

			}
			System.out.println();

		}

	}
}