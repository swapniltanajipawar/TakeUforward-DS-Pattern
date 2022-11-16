package Array;

public class check_array_sorted {

	public static void main(String[] args) {
		int[] arr = { 1, 100, 15, 20, 30 };
		boolean sorted = true;

		for (int i = 0; i <arr.length-1; i++) {
			if (arr[i] > arr[i + 1]) {
				sorted = false;
			}
		}
		if (sorted == true) {
			System.out.println("Array is sorted");
		} else {
			System.out.println("Array is not sorted");
		}

	}

}
