package Pattern_tuf;

public class class19 {

	public static void main(String[] args) 
	{
		int lines=10;
		int starcount=5;
		int spacecount=0;
		int mid= lines/2;
		
		for(int i=1; i<=lines; i++)
		{
			for(int j=1; j<=starcount; j++)
			{
				System.out.print("*");
			}
			for(int k=1; k<=spacecount; k++)
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
				starcount--;
				spacecount= spacecount+2;
			}
			
			else if(i==mid+1) 
			{
				starcount=starcount;
				spacecount= spacecount;
			}
			
			else 
			{
				starcount++;
				spacecount= spacecount-2;
			}
				
		}

	} 

}
