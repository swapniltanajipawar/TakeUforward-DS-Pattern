package Array;

public class rotate_array_by_k_Right {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
//Rotate an array index by the kth=2 position
		int k=2;

		int[] temp = new int[arr.length];
		
		for(int i=0; i<arr.length; i++)
		{
			temp[(i+k)%arr.length]=arr[i];
		}
		
		for(int j=0; j<temp.length; j++)
		{
			System.out.print(temp[j]+" ");
		}
	}

}
