package Pattern_tuf;

public class programme9 {

	public static void main(String[] args) {

		int lines = 10;
		int starcount = 1;
		int spacecount = 4;
		int mid = (lines + 1) / 2;

		for (int i = 1; i <= lines; i++) {
			for (int j = 1; j <= spacecount; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= starcount; k++) {
				System.out.print("*");
			}
			System.out.println();
			if (i < mid) {
				starcount = starcount + 2;
				spacecount--;
			} else if (i == mid) {
				starcount = starcount;
			}

			else {
				starcount = starcount - 2;
				spacecount++;
			}
		}
	}

}
