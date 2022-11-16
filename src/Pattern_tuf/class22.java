package Pattern_tuf;

public class class22 {

	public static void main(String[] args) {
		int lines = 7;
		int numbercount = 7;
		int value = 4;
		for (int i = 0; i < lines; i++) {
			for (int j = 0; j < numbercount; j++) {
				if (i == 0 || i == numbercount - 1 || j == 0 || j == lines - 1) {
					System.out.print(value);
				} else {

					if (i == 1 || i == numbercount - 2 || j == 1 || j == lines - 2) {
						System.out.print(3);
					} else {
						if (i == 2 || i == numbercount - 3 || j == 2 || j == lines - 3) {
							System.out.print(2);
						} else {
							if (i == 3 || i == numbercount - 4 || j == 3 || j == lines - 4) {
								System.out.print(1);
							}
						}

					}

				}

			}
			System.out.println();
		}
	}
}
