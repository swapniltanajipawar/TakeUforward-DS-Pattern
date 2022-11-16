package Pattern_tuf;

public class class10 {

	public static void main(String[] args) {
		
		int lines=9;
		int starcount=1;
		int mid = (lines)/2;
		for(int i=0; i<lines; i++)
		{
			for(int j=0; j<starcount; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<mid)
			{
				starcount++;
			}
			else {
				starcount--;
			}
		}
	}

}
