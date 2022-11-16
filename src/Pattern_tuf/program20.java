package Pattern_tuf;

public class program20 {

	public static void main(String[] args) 
	{
		int lines=9;
		int mid=(lines+1)/2;
		int spaces=8;
		int starcount=1;
		System.out.println(mid);
		
		for(int i=1; i<=lines; i++)
		{
			for(int j=1; j<=starcount; j++)
			{
				System.out.print("*");
			}
			for(int k=1; k<=spaces; k++)
			{
				System.out.print(" ");
			}
			for(int l=1; l<=starcount; l++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<mid)
			{
				starcount++;
				spaces=spaces-2;
			}else {
				
				starcount--;
				spaces=spaces+2;
			}
		}
	}

}
