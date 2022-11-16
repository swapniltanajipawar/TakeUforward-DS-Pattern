package Array;

import java.util.Arrays;

public class right_roate_by_d_pos {

	public static void main(String[] args) {
		int d = 3;
		int[] a = {1,2,3,4,5};

		for (int j=0; j<d; j++) 
		{
			int last=a[a.length - 1];
			for (int i=a.length-1; i>0; i--) 
			{
				a[i] = a[i-1];
			}
			a[0] = last;
			System.out.println(Arrays.toString(a));

		}
		System.out.println(Arrays.toString(a));

	}
}
